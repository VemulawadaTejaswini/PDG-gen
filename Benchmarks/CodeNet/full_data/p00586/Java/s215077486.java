import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem1000_AplusBProblem {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem1000_AplusBProblem test = new Problem1000_AplusBProblem();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			while((line = reader.readLine()) != null) {
				String[] textArray = line.split(" ");
				System.out.println(test.plus(Integer.parseInt(textArray[0]), Integer.parseInt(textArray[1])));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	int plus(int a, int b) {
		return a + b;
	}
}