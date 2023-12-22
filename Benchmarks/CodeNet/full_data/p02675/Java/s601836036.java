import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static int answer=Integer.MAX_VALUE;
 
	public static int N;
	public static int M;
	public static int X;
 
	public static int[] C;
	public static int[][] A;
 
	public static void main(String[] args) {
 

		char[] N = in.next().toCharArray();


		String answer;
		char c = ' ';
		for(int i=0;i<N.length;i++) c = N[i];
		
		if(c == '2' || c == '4' || c == '5' || c == '7' || c == '9') answer = "hon";
		else if(c== '0' || c == '1' || c == '6' || c == '8') answer = "pon";
		else answer = "bon";
		System.out.println(answer);
 
	}

 
	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}