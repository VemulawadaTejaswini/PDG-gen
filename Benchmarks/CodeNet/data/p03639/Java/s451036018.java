import java.io.*;
import java.math.*;
import java.util.*;
public class Main{
 
	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int T = 0;
		int F = 0; //Two and four
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			if (x%4==0) F++;
			else if (x%2==0) T++;
		}
		if (T>=1) {
			N-=T;
			N++; //2 2 1 4 1 doesn't work
		}  //multiples of two can be joined as one contiguous sub-array since 2^2 = 4
		if (F>=1) {
			N-=3;
			F--;
			N-=F*2;
		}
		System.out.println(N<=0?"Yes":"No");
	}
}