import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		char[][]a=new char[H][W];
		for(int i=0;i<H;i++) {
			String s=sc.next();
			a[i]=s.toCharArray();
		}
		int[]alph=new int[26];
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				alph[a[i][j]-'a']++;
			}
		}
		int g1=(H%2)*(W%2);
		int g2=(H/2)*(W%2)+(W/2)*(H%2);
		int g3=(H/2)*(W/2);
		
		
		for(int i=0;i<26;i++) {
			g3-=alph[i]/4;
			alph[i]%=4;
			
			g2-=alph[i]/2;
			alph[i]%=2;
			
			g1-=alph[i]%2;
		}
		String ans="Yes";
		if(g3>0)ans="No";
		g2+=2*g3;
		if(g2>0)ans="No";
		System.out.println(ans);
	}
}