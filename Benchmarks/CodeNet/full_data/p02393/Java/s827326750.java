import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int matrix[] = new int[3];
		int n = 0;

		//配列にデータを入力
		while (sc.hasNext()) {
			matrix[n] = sc.nextInt();
            n++;
        }

		//ソート
		java.util.Arrays.sort(matrix);

		//出力
		for(int i =0;i < n; i++){
			System.out.println(matrix[i]);
		}
	}
}
