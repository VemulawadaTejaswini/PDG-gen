
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] c = new int[(int) 1e6+1];
		
		/*
		 * a * b + c = n
		 * n / b = a ... c
		 */
		long ans = 0;
		for( int i=1 ; i<n ; i++ ) {
			int n2 = n/i + ( n%i != 0 ? 1 : 0) - 1;
			ans+= n2;
		}
		
		System.out.println(ans);
		

	}

}

