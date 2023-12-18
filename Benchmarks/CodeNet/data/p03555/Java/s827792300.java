import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[3];
		String[] t = new String[3];
		
		for (int i = 0; i < 3; i++) {
			s[i] = sc.next();
		}
		
		for (int i = 0; i < 3; i++) {
			t[i] = sc.next();
		}
		
		if (s[0].equals(t[2]) && s[1].equals(t[1]) && s[2].equals(t[0])) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
}