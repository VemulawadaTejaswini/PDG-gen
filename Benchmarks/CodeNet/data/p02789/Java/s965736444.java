
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String info = br.readLine();
		String[] order = info.split(" ");
		int[] numbers = new int[]{Integer.parseInt(order[0]), Integer.parseInt(order[1])};
		
		if(numbers[0]==numbers[1]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
