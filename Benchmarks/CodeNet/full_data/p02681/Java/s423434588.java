import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); String t = sc.next(); int lenS = s.length(); int lenT = t.length();
		boolean value = false;
		if (lenS == lenT) {
			value = false;
		} else if (lenS + 1 == lenT && s.substring(0, lenS).equals(t.substring(0, lenS))) {
			value = true;
		}

		System.out.println(value ? "Yes" : "No");
	}
}
