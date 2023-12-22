import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int [] array = new int[7];
		for (int i = 0;i < 6;i++) {
			array[i] = Integer.parseInt(read.readLine());
			System.out.println("Case " + (i + 1) +": "+array[i]);
		}
	
			
	}
}