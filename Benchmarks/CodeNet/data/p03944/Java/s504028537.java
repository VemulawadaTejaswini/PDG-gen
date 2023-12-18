import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int a[][] = new int[H][W];
		for (int i=0;i<N;i++) {
			int x= sc.nextInt();
			int y= sc.nextInt();
			int b=sc.nextInt();
			if (b==1) {
				for (int k=0;k<H;k++) {
					for (int j=0;j<x;j++) {
						a[k][j]++;
					}
				}
			} else if (b==2) {
				for (int k=0;k<H;k++) {
					for (int j=x;j<W;j++) {
						a[k][j]++;
					}
				}
			} else if (b==3) {
				for (int k=0;k<y;k++) {
					for (int j=0;j<W;j++) {
						a[k][j]++;
					}
				}
			} else {
				for (int k=y;k<H;k++) {
					for (int j=0;j<W;j++) {
						a[k][j]++;
					}
				}
			}
		}
		int count=0;
		for (int i=0;i<H;i++) {
			for (int j =0;j<W;j++) {
				if (a[i][j]==0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}