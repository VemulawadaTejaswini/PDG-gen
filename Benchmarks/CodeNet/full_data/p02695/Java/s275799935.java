import java.util.Scanner;

public class Main {
	
	static long goukei = 0;
	static long MAX = 0;
	static Scanner scan = new Scanner(System.in);
	static int N = scan.nextInt();
	static int[]A = new int[N];//N~10;
	static int M = scan.nextInt();
	static int Q = scan.nextInt();
	
	static int[]g = new int[Q];
	static int[]b = new int[Q];
	static int[]c = new int[Q];
	static int[]d = new int[Q];
	
	
	public static void main(String[]args) {
		
			
			for(int i = 0;i<Q;i++) {
				g[i] = scan.nextInt();
				b[i] = scan.nextInt();
				c[i] = scan.nextInt();
				d[i] = scan.nextInt();
			}
			
			ho(A,0);
			
		
			System.out.println(MAX);
	
		
		
	}
	
	
	private static void ho(int[]a,int N) {
		
		if(N==a.length) {
			for(int i = 0;i<N;i++) {
				//System.out.print(a[i]);
				//System.out.print(" ");
			}
			
			
			goukei = 0;
			for(int i = 0;i<Q;i++) {
				if(a[b[i]-1]-a[g[i]-1]==c[i]) {
					goukei+=d[i];
				}
			}
			
			//System.out.print(goukei);
			//System.out.print(" ");
			
			
			if(MAX<goukei)MAX = goukei;
			
			//System.out.println(MAX);
			
		}else if(N==0) {
			for(int i =1;i<=a.length;i++){
				a[N] = i;
				ho(a,N+1);
			}
		}else{
			for(int i =a[N-1];i<=a.length;i++) {
				a[N]=i;
				ho(a,N+1);
			}
		}
		
	}
		

}
