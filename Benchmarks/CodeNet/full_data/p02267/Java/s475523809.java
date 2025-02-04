import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		

		int n = Integer.parseInt(reader.readLine());
		int[] numbers = new int[n];
		String[] strArray = reader.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(strArray[i]);
		}
		int q = Integer.parseInt(reader.readLine());
		int[] targets = new int[q];
		strArray = reader.readLine().split(" ");
		for (int i = 0; i < q; i++) {
			targets[i] = Integer.parseInt(strArray[i]);
		}		
	
		int ans = 0;
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < n; j++) {
				if (targets[i] == numbers[j]) {
					ans++;
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
}
