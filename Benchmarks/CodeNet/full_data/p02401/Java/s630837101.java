import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] strArray = br.readLine().split(" ");
			if (strArray[1].equals("?")) {
				break;
			}
			long a = Long.parseLong(strArray[0]);
			long b = Long.parseLong(strArray[2]);
			String op = strArray[1];
			switch (op) {
				case "+":
				System.out.println(a + b);
				break;
				case "-":
				System.out.println(a - b);
				break;
				case "*":
				System.out.println(a * b);
				break;
				case "/":
				System.out.println(a / b);
				break;
			}
		}
	}
}