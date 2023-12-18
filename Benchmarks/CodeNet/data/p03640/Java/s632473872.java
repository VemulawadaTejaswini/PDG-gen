import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int a[] = new int [N];
		int nowX= 0,nowY= 0;
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		int result[][] = new int[H][W];
		for (int i=0;i<N;i++) {
			for(int j=0;j<a[i];j++) {
				result[nowY][nowX] = i+1;
				if (nowY%2==0) {
					nowX++;
					if (nowX==W) {
						nowX--;
						nowY+=1;
					}
				} else {
					nowX--;
					if (nowX<0) {
						nowY+=1;
						nowX=0;
					}
				}
			}
		}
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				System.out.print(result[i][j]+ " ");
			}
			System.out.println();
		}
	}

}