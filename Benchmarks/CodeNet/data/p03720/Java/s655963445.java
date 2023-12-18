import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int	N = sc.nextInt(),M=sc.nextInt();
		int[][] arrayM = new int[M][2];
		int[] array=new int[N];

		for(int i=0;i<M;i++) {
			arrayM[i][0] = sc.nextInt();
			arrayM[i][1] = sc.nextInt();
		}

		for(int i=0;i<M;i++) {
			array[arrayM[i][0]-1]++;
			array[arrayM[i][1]-1]++;
		}
		for(int i:array) {
			System.out.println(i);
		}
	}
	public static int sample() {
		return 1;
	}

}
