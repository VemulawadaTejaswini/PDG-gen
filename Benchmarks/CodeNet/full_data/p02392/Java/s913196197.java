import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] arrInt = (new BufferedReader(new InputStreamReader(System.in))).readLine().split(" ");

		int a = Integer.parseInt(arrInt[0]);
		int b = Integer.parseInt(arrInt[1]);
		int c = Integer.parseInt(arrInt[2]);
		if(a < b && b < c) System.out.println("YES");
		else System.out.println("NO");
	}
}