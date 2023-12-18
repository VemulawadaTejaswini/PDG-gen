import java.util.Scanner;

import java.util.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long[] abc = new long[5];
		long[] mul = new long[5];
		boolean[] mod = new boolean[5];
	    long max = 1;
		for(int i = 0; i < 5; i++){
			abc[i] = scan.nextLong();
			mul[i] = ( n % abc[i] ==0) ? n / abc[i]   :n /abc[i]  +1;
			if(mul[i] > max)  max = mul[i];
		}
		System.out.println(4 +max);

	}
}
