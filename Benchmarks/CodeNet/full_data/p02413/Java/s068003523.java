import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] spread = new int[r][c];

		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				spread[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<r;i++) {
			int sum=0;
			for(int j=0;j<c;j++) {
				sum += spread[i][j];
				System.out.print(spread[i][j]+" ");
			}
			System.out.println(sum);
		}

		int total=0;
		for(int i=0;i<c;i++) {
			int sum=0;
			for(int j=0;j<r;j++) {
				sum += spread[j][i];
			}
			System.out.print(sum+" ");
			total += sum;
		}
		System.out.println(total);
	}

}

