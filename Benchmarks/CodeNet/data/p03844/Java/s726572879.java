import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String[] spl = br.readLine().split(" ");
			int a = Integer.parseInt(spl[0]);
			String op = spl[1];
			int b = Integer.parseInt(spl[2]);
			switch(op) {
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}