import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n = Integer.parseInt(br.readLine());

		int min = Integer.MAX_VALUE;
		for(int i = 1; i < n - 1; i++){
			int a = sumOfDigits(i);
			int b = sumOfDigits(n - i);

			if(a + b < min){
				min = a + b;
			}
		}

		System.out.println(min);
	}

	static int sumOfDigits(int x){
		int result = 0;
		while(x > 0){
			result += x%10;
			x /= 10;
		}

		return result;
	}

}
