import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {


		while (true) {
			Scanner in = new Scanner(System.in);
			String inputed = in.nextLine();
			int intInputed = Integer.parseInt(inputed);

			int i = 0;

			if (intInputed == 0) { break; }

			System.out.print("case " + (i + 1) + ": " + intInputed + " ");
			i++;
		}


	}

}