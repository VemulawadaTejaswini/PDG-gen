import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] n;
		String[] s;
		n=new int[9];
		s=new String[9];
		for(int ttt=0;ttt<t;ttt++){
			int[] b,r,g;
			b=new int[10];
			r=new int[10];
			g=new int[10];
			for(int i=0;i<9;i++)n[i]=sc.nextInt();
			for(int i=0;i<9;i++){
				s[i]=sc.next();
				if(s[i].equals("B"))b[n[i]]++;
				if(s[i].equals("G"))g[n[i]]++;
				if(s[i].equals("R"))r[n[i]]++;
			}
			int flag=0;
			for(int i=1;i<=7;i++){
				if(b[i]>=1 && b[i+1]>=1 && b[i+2]>=1){
					flag+=1;
					b[i]-=1;
					b[i+1]-=1;
					b[i+2]-=1;
				}
				if(r[i]>=1 && r[i+1]>=1 && r[i+2]>=1){
					flag+=1;
					r[i]-=1;
					r[i+1]-=1;
					r[i+2]-=1;
				}
				if(g[i]>=1 && g[i+1]>=1 && g[i+2]>=1){
					flag+=1;
					g[i]-=1;
					g[i+1]-=1;
					g[i+2]-=1;
				}
			}
			for(int i=1;i<=9;i++)if(b[i]>=3 || r[i]>=3 || g[i]>=3)flag+=1;
			System.out.printf("%d\n",flag/3);
		}
	}
}