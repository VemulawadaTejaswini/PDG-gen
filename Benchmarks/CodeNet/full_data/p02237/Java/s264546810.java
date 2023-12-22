import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] adMat = new int[N][N];
		for(int i = 0;i<N;i++){
			int row = sc.nextInt();
			int count = sc.nextInt();
			for (int j = 0; j < count; j++) {
				int id = sc.nextInt();
				adMat[row-1][id-1]++;
			}
		}
		for (int[] elem: adMat) {
			String[] array = new String[N];
			for (int i = 0; i < array.length; i++) {
				array[i] = String.valueOf(elem[i]);
			}
			System.out.println(String.join(" ", array));
		}

	}

}