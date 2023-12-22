import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num = new int[26];
		String s = stdIn.nextLine();
		s = s.toLowerCase();
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 95 && c <= 122)
				num[(int)c - 97] ++;
		}
		for (int i=0; i<num.length; i++) {
			System.out.println((char)(i+97)+" : "+num[i]);
		}
	}
}