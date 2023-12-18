import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int H,W;
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		long c[][] = new long[10][10];
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				c[i][j] = sc.nextLong();
			}
		}
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				for (int k=0;k<10;k++) {
					if (c[i][j]>c[i][k]+c[k][j]) {
						c[i][j] =c[i][k]+c[k][j];
					}
				}
			}
		}
		long result=0;
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				int s= sc.nextInt();
				if (s>-1) {
					result +=c[s][1];
				}
			}
		}
		System.out.println(result);
	}
}
