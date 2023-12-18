import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char c[][] = new char[H][W];
		for (int i=0;i<H;i++) {
			char ch[] = sc.next().toCharArray();
			for (int j=0;j<W;j++) {
				c[i][j] = ch[j];
			}
		}
		int a[][]= new int[H][W];
		int h = 0;
		int w = 0;
		a[h][w]=1;
		while (h<=H-1&&w<=W-1) {
			if (w<W) {
				if (c[h][w+1]=='#') {
					w++;
					a[h][w]=1;
				} else if (h<H) {
					if (c[h+1][w]=='#') {
						h++;
						a[h][w]=1;
					} else {
						System.out.println("Impossible");
						return ;
					}
				} else {
					System.out.println("Impossible");
					return ;
				}
			} else {
				if (h<H) {
					if (c[h+1][w]=='#') {
						h++;
						a[h][w]=1;
					} else {
						System.out.println("Impossible");
						return ;
					}
				} else {
					System.out.println("Impossible");
					return ;
				}
			}
		}
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				if (a[h][w]==0&&c[h][w]=='#') {
					System.out.println("Impossible");
					return ;
				}
			}
		}
		System.out.println("Possible");
	}
}