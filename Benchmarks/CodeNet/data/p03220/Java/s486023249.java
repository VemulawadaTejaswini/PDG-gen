import java.util.Scanner;
import java.util.TreeSet;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();

		final int[] array = new int[10000000];
		TreeSet<Integer> primes = new TreeSet<Integer>();
		for (int n : array) primes.add(n);
		
		for (int i = 0; i <N; i++) { 
		array[i] = sc.nextInt();
		}
		
		int v = (int)(T-(array[N]*0.006));
		
		final int max = 1000000;
		
		int number = v;
		Integer numberObject = v;
		int floor = primes.floor(numberObject); 
		int ceiling = primes.ceiling(numberObject); 
		int nearestPrime = Math.abs(floor - v) <= Math.abs(ceiling - v) ? floor : ceiling;

		
		System.out.println(nearestPrime);
	}}
