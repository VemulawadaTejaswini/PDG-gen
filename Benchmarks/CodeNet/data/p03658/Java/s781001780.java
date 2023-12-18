import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Integer[] c = new Integer[a];
		int d = 0;
		for (int i = 0; i < a; i++) {
			c[i] = sc.nextInt();
		}
		
		Arrays.sort(c, Comparator.reverseOrder());
		
		
		for (int i = 0; i < b; i++) {
			d += c[i];
		}
		
		System.out.println(d);
	}
}