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
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = 1;
		for (int i = 0; i < n; i++) {
		    if (m >= k) {
		        m += k;
		    } else {
		        m *= 2;
		    }
		}
		System.out.println(m);
	}
	
	
}