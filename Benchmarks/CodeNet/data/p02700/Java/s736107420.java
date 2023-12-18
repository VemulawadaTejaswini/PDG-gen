import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		String[] arr1 = line1.split(" ");
		int ts = Integer.parseInt(arr1[0]);
		int th = Integer.parseInt(arr1[1]);
		int as = Integer.parseInt(arr1[2]);
		int ah = Integer.parseInt(arr1[3]);
		while(true) {
			th = ts - th;
			ah = as - ah;
			if(ah <= 0) {
				System.out.println("No");
				break;
			}
			if(th <= 0) {
				System.out.println("Yes");
				break;
			}
		}
	}

}
