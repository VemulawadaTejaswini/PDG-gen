import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		long B = input.nextLong();
		long X = input.nextLong();
		long L = 0;
		long R = 0; //Smallest and largest numbers in [A,B] that are divisible by x
		long ans = 0;
		if (A%X==0) L=A;
		else {
			L=A/X;
			L++; //Converting to ceil division
			L*=X;
		}
		if (B%X==0) R=B;
		else {
			R=B/X;
			R*=X; //Floor division for accurate upper bound within [A,B] range
		}
		long possible = R-L;
		ans+=possible/X;
		ans++; //Need to include lowerbound of range as well
		System.out.println(ans);
	}	
}