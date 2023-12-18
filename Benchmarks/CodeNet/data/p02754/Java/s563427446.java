import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long A = input.nextLong();
		long B = input.nextLong();
		long numCycles = N/(A+B);
		long ans = A*numCycles;
		N%=(A+B);
		ans+=Math.min(N, A);
		System.out.println(ans);
	}
}