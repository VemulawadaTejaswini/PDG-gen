import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); int[] arr = new int[t]; int sum = 0;
		for (int i = 0; i<t; i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		int n = sc.nextInt();
		while (n-- > 0) {
			int a = sc.nextInt(); int b = sc.nextInt();
			for (int i = 0; i<t; i++) {
				if (arr[i] == a) {
					arr[i] = b;
					sum = sum - a + b;
				}
			}//end for
			System.out.println(sum);
		}
	}
}
