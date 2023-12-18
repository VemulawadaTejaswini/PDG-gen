import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //Truncate leftmost white stones 
		//that precede black stones and rightmost black stones that follow white stones
		//Right most = black has no affect on outcome
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String x = input.next();
		int B = 0;
		int W = 0;
		int START = 0;
		int END = N-1;
		for (int i = 0; i < N; i++) {
			if (x.charAt(i)=='#') {
				START=i; break;
			}
		}
		for (int i = N-1; i >= 0; i--) {
			if (x.charAt(i)=='.') {
				END=i; break;
			}
		}
		for (int i = START; i <= END; i++) {
			if (x.charAt(i)=='.') W++;
			else B++;
		}
		System.out.println(Math.min(B, W));
	}	
}