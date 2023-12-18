import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] tmpArray = br.readLine().split(" ");

		int input[] = new int[n];
		long fixed[] = new long[n];

		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
			fixed[i] = input[i] - (i + 1);
		}

		//debug
//		for(int i = 0; i < n; i++){
//			System.out.print(fixed[i] + " ");
//		}
//		System.out.println();

//		Arrays.sort(fixed);
		//平均を求める
		double ave = 0;
		for(int i = 0; i < n; i++){
			ave += fixed[i];
		}
		ave /= n;
//		System.out.println(ave);
		long d1 = -(long)Math.ceil(ave);
		long d2 = -(long)Math.floor(ave);
//		System.out.println(d1+ " " + d2);

		long result1 = 0;
		long result2 = 0;

		for(int i = 0; i < n; i++){
			result1 += Math.abs(fixed[i] + d1);
			result2 += Math.abs(fixed[i] + d2);
		}

		System.out.println(Math.min(result1, result2));
	}

}
