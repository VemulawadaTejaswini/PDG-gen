import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0006_ReverseSequence {
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			
			while((line = reader.readLine()) != null) {
				char[] sequence = line.toCharArray();
				if(sequence.length == 0) {
					break;
				}
				for(int i = sequence.length -1; i > -1; i--) {
					System.out.print(sequence[i]);
				}
				System.out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}