import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] zahyo = new int[n][d];
		double distance = 0;
		int count=0;
		int sum=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				zahyo[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n-1; i++) {
			for (int k = i+1; k < n; k++) {
				for (int j = 0; j < d; j++) {
				sum += (zahyo[i][j] - zahyo[k][j]) * (zahyo[i][j] - zahyo[k][j]);
				}
				distance=Math.sqrt(sum);
				if(distance==(int)distance) count++;
				sum=0;
			}
		}
		System.out.println(count);
	}
}