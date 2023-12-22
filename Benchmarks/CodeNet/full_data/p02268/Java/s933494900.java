import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] S = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		int q = sc.nextInt();
		int[] T = IntStream.range(0, q).map(i -> sc.nextInt()).toArray();
		System.out.println(IntStream.range(0, q).filter(i -> S[Math.max(0, Math.min(n, Arrays.binarySearch(S, T[i])))] == T[i]).count());
	}
}
