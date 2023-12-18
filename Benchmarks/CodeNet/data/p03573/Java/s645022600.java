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
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int ans1 = Math.max(a, b);
		int ans2 = Math.max(b, c);
		
		if (ans1 < ans2) System.out.println(ans2);
		else System.out.println(ans1);
		
	}

	
	
}