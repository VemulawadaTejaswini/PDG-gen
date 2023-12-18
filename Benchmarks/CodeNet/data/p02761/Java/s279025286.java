import java.util.Scanner;
 
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	public static void main(String[] args) {
		int N=sc.nextInt();
		int M=sc.nextInt();
		int s[]=new int[M];
		int c[]=new int[M];
		for(int i=0;i<M;i++) {
			s[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		boolean xx=true;
		boolean xxx=true;
		if(N==1) {
			for(int i=0;i<=9&&xxx;i++) {
				xx=true;
				for(int a=0;a<M&&xx;a++) {
					if(String.valueOf(i).charAt(s[a]-1)!=c[a]+48) {
					xx=false;
					}
					
				}
				if(xx) {
					System.out.println(i);
					xxx=false;
				}
			}
		}else if(N==2) {
			for(int i=10;i<=99&&xxx;i++) {
				xx=true;
				for(int a=0;a<M&&xx;a++) {
					if(String.valueOf(i).charAt(s[a]-1)!=c[a]+48) {
					xx=false;
					}
					
				}
				if(xx) {
					System.out.println(i);
					xxx=false;
				}
			}
		}else if(N==3) {
			for(int i=100;i<=999&&xxx;i++) {
				xx=true;
				for(int a=0;a<M&&xx;a++) {
					if(String.valueOf(i).charAt(s[a]-1)!=c[a]+48) {
					xx=false;
					}
					
				}
				if(xx) {
					System.out.println(i);
					xxx=false;
				}
			}
		}
		if(xxx) {
			System.out.println(-1);
		}
		
	}
}
