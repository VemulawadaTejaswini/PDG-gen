import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			x = in.readLine();
			int num = Integer.parseInt(x);
			
			x = in.readLine();
			String[] num_s = x.split(" ");
			
			int[] numbers = new int[num];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = Integer.parseInt(num_s[i]);
			}
			
			Arrays.sort(numbers);
			System.out.print(numbers[0]);
			for (int i = 1; i < num; i++) {
				System.out.print(" " + numbers[i]);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}