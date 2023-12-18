import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			long[] ar = new long[n];
			long sum = 0;
			long abs = 9223372036854775807l;
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextLong();
				sum += ar[i];
			}
			for (int i = 0; i < n; i++) {
				sum = Math.abs(sum - 2*ar[i]);
				if (sum < abs) {
					abs = sum;
				}
			}
			System.out.println(abs);

		    sc.close(); }

	public static boolean isEven(int n ) {
		if (n % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
}