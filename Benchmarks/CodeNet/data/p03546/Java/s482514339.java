import java.util.*;
public class Main {
	
	static int H;
	static int W;
	static int c[][];
	static int A[][];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		c = new int[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				c[i][j]=sc.nextInt();
			}	
		}
		A = new int[H][W];
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				A[i][j]=sc.nextInt();
			}	
		}
		sc.close();
			
		
		//Froyd Warshall
		
		for(int k=0;k<10;k++) {
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					c[i][j]=Math.min(c[i][j], c[i][k]+c[k][j]);
				}
			}
		}
		
		int cnt[] = new int[10];
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if (A[i][j]==-1) continue;
				cnt[A[i][j]]++;
			}	
		}
		int ans = 0;
		for(int i=0;i<10;i++) {
			ans += cnt[i]*c[i][1];
		}
		System.out.println(ans);
//		//for debug
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
			
		
	}
}

