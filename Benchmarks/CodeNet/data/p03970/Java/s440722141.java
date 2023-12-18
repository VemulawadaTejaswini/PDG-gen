import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		
		String t = "CODEFESTIVAL2016";
		
		int count = 0;
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) != string.charAt(i))
				count++;
		}
		System.out.println(count);
	}

}