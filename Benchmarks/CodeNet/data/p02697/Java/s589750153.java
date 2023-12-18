import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int hi = N;
		int lo = 1;
		for (int i = 0; i < M; i++) {
			System.out.println(lo+" "+hi);
			lo++;
			hi--;
		}
	}
}