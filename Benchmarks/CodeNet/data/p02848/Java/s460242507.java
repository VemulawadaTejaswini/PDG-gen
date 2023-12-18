import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String s = in.next();

		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String result = "";
		for (int i=0; i<s.length(); i++)
			result += letters.charAt(s.charAt(i) - 'A' + n);

		System.out.println(result);
	}
}

