
//package practice;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] split = s.split("");
		List<String> cool = Arrays.asList(split);
		List<String> temp = cool.subList(0,  ((s.length() - 1) / 2));
		Collections.reverse(temp);
		temp = cool.subList(((s.length() + 3) / 2) - 1, s.length());
		Collections.reverse(temp);
		String check = "";
		for (String x : cool) {
			check += x;
		}
		if (check.equals(s)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}


