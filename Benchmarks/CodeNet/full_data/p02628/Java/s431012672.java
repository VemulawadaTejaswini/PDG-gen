import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// input
		Scanner inData = new Scanner(System.in);

		// 種類
		int N = inData.nextInt();
		// 購入種別数
		int K = inData.nextInt();
		// 各種類ごとの値段
		int[] P = new int[N];
		for(int i=0; i<N; i++) P[i] = inData.nextInt();
		Arrays.sort(P);

		int kin = 0;
		for (int i = 0; i < K; i++) {
			kin += P[i];
		}

		System.out.println(kin);

		inData.close();
	}
}