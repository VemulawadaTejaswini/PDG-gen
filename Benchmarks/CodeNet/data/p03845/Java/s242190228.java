import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		int[] buff = array.clone();
		int M = sc.nextInt();
		int[][] arrayM = new int[M][2];
		long sum=0;

		for(int i=0;i<M;i++) {
			for(int j=0;j<2;j++) {
				arrayM[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<M;i++) {
			buff[arrayM[i][0]-1] = arrayM[i][1];
			for(int a:buff) {
				sum+=a;
			}
			System.out.println(sum);
			sum=0;
			buff=array.clone();
		}


	}
	public static int sample(int n) {
		return n;
	}

}
