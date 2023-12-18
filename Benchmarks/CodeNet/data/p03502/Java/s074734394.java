import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();

		int sum = 0;
		int d = n;
		while (d>0) {
			sum = sum + (d%10);
			d/=10;
		}

		System.out.println (n%sum == 0 ? "Yes" : "No");
	}
}
