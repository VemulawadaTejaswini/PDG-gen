import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int f = sc.nextInt();
      	int n = f;
		int len = String.valueOf(n).length();
		int d = (int)Math.pow(10, len - 1);
		int sum = 0;
		
		for (int i = 0; i < len; i++) {
			sum += (n / d);
			n %= d;
			d /= 10;
		}
		
		if (f % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
		
}
	
	
