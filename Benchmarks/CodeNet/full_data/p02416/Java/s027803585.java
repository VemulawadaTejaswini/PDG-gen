import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num;
		int sum;
		
		do {
			sum = 0;
			num = br.readLine().split("");
			
			for (String str : num) sum += Integer.valueOf(str);
			
			if (sum == 0) break;
			
			System.out.println(sum);

		} while (true);
		
	}
}