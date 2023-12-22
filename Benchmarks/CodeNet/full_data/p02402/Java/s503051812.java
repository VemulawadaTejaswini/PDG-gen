import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] inputNum = br.readLine().split(" ");
		int minNum = Integer.parseInt(inputNum[0]);
		int maxNum = Integer.parseInt(inputNum[0]);
		long total = 0;

		for (int i = 0; i < n; i++) {
			int num =  Integer.parseInt(inputNum[i]);
			if (num < minNum) {
				 minNum = num;
			}else if (maxNum < num) {
				maxNum = num;
			}
			total += num;
		}

		System.out.println(minNum + " " + maxNum + " " + total);
	}

}