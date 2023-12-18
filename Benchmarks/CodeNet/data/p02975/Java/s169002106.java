
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] tmpArray = br.readLine().split(" ");

		long input[] = new long[n];

		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}

		Arrays.sort(input);

		boolean result = true;
		for(int i = 0; i < n; i++){
			if(input[(i + 1)%n] != (input[i%n]^input[(i + 2)%n])){
				result = false;
				break;
			}
		}

		if(result){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
