import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			String n = sc.next();
			int[] ar = new int[n.length()-2];
			int ans = 10000;
			for (int i = 0; i < n.length()-2; i++) {
				ar[i] = Integer.parseInt(n.substring(i,i+3));
			}

			for (int i = 0; i < n.length()-2; i++) {
				ans  = Math.min(ans, Math.abs(ar[i]-753));
			}
			System.out.println(ans);

		    sc.close(); }

	public static boolean isEven(int n ) {
		if (n % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
}