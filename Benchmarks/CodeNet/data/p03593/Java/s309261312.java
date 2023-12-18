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
		String ans="Yes";
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
		int g1=1;
		int g2=H/2+W/2;
		int g3=H/2*W/2;
		
		for(int i=0;i<26;i++) {
			if((alph[i]%4==1 || alph[i]%4==3) && g1>0){
				alph[i]-=1;
				g1--;
			}
		}
		for(int i=0;i<26;i++) {
			if(alph[i]%4==2 && g2>0){
				alph[i]-=2;
				g2--;
			}
		}
		for(int i=0;i<26;i++) {
			if(alph[i]%4==0 && g3>0) {
				alph[i]-=4;
				g3--;
			}
		}
		for(int i=0;i<26;i++){
			if(alph[i]>0) {
				ans="No";
				break;
			}
		}
		System.out.println(ans);
	}
}