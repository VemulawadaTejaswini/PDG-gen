import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int N = scanner.nextInt();
		int[][] graph = new int[W][H];
		int[] x = new int[N];
		int[] y = new int[N];
		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
			a[i] = scanner.nextInt();
		}

		for(int i=0;i<N;i++) {
			switch(a[i]) {
			case 1:
				for(int j=0;j<x[i];j++) {
					for(int k=0;k<H;k++) {
						graph[j][k]=1;
					}
				}
				break;
			case 2:
				for(int j=x[i];j<W;j++) {
					for(int k=0;k<H;k++) {
						graph[j][k]=1;
					}
				}
				break;
			case 3:
				for(int j=0;j<W;j++) {
					for(int k=0;k<y[i];k++) {
						graph[j][k]=1;
					}
				}
				break;
			case 4:
				for(int j=0;j<W;j++) {
					for(int k=y[i];k<H;k++) {
						graph[j][k]=1;
					}
				}
				break;
			}
		}
		int ans =0;
		for(int i=0;i<W;i++) {
			for(int j=0;j<H;j++) {
				ans += graph[i][j];
	//			System.out.print(graph[i][j]+" ");
			}
		//	System.out.println();
		}
		System.out.println(W*H-ans);
		scanner.close();
	}

}
