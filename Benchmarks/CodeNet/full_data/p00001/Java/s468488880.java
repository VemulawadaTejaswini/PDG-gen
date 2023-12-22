import java.io.Console;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Console console = System.console();
		int[] iarray = new int[10];
		for (int i = 0; i < iarray.length; i++) {
			String a = console.readLine();
			iarray[i] = Integer.parseInt(a);
		}
		Arrays.sort(iarray);
		for (int i = 1; i <= 3; i++) {
			System.out.println(iarray[10 - i]);
		}

	}

}