import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BufferedReader inMsg = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
			while ((line = inMsg.readLine()) != null) {
				String[] ab = line.split(" ");
				Integer a = 0;
				Integer b = 0;
				Integer sqr = 0;
				Integer liner = 0;
				
				a = Integer.parseInt(ab[0]);
				b = Integer.parseInt(ab[1]);
				sqr = a * b;
				liner = a * 2 + b *2;

				System.out.println(sqr + " " + liner);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}