import java.io.*;
public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while ((line = br.readLine()) != null) {
			String[] numbers = line.split("");
			for (int i = numbers.length - 1; i >= 0; i--){
				System.out.print(numbers[i]);
			}
			System.out.println();
        }
	}
}