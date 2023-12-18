import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		String t = in.next();
		String result = "";
		for (int i=0; i<s.length(); i++) {
			result += s.charAt(i) + "" + t.charAt(i);
		}
		System.out.println(result);
	}
}

