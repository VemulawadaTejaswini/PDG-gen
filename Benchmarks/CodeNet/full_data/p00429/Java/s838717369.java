import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static String a;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			
			a = stdIn.next();
			for(int i = 0; i < n; i++) {
				solv();
			}
			System.out.println(a);
		}
	}
	public static void solv() {
		int count = 0;
		char now = a.charAt(0);
		StringBuffer tmp = new StringBuffer();
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != now) {
				tmp.append(String.valueOf(count) + String.valueOf(now));
				count = 0;
				now = a.charAt(i);
			}
			if(i+1 == a.length()) {
				tmp.append(String.valueOf(count+1) + String.valueOf(now));
			}
			else {
				count++;
			}
		}
		a = tmp.toString();
	}
}