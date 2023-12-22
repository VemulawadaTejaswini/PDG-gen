import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray(); char[] t = sc.next().toCharArray();
		int count = 0; int len = s.length;
		for (int i = 0; i<len; i++) {
			if (s[i] != t[i])
				count++;
		}
		System.out.println(count);
	}
}
