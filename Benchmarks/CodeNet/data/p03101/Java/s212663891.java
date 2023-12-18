import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int[][] arr1 = new int[H][W];
		for(int i=0;i<H;i++) {
			for(int j=0; j<W;j++) {
				arr1[i][j] = 0;
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<W;j++) {
				arr1[i][j] = 1;
			}
		}
		for(int i=0;i<H;i++) {
			for(int j=0;j<w;j++) {
				arr1[i][j] = 1;
			}
		}
		int count = 0;
		for(int i=0;i<H;i++) {
			for(int j=0; j<W;j++) {
				if(arr1[i][j] == 0)count++;
			}
		}
		System.out.println(count);
	}
}

