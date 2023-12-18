import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		String[] arr1 = line1.split(" ");
		int s = Integer.parseInt(arr1[0]);
		int w = Integer.parseInt(arr1[1]);
		if(w >= s) {
			System.out.println("unsafe");
		} else {
			System.out.println("safe");
		}
	}

}
