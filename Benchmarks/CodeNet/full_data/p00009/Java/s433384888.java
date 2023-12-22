import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = null;
		while ((input = sc.next()) != null) {
			System.out.println(calc(input));
		}
	}
	
	public static String calc (String input) {
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		primeList.add(2);
		for (int i=3;i<=Integer.parseInt(input);++i) {
			if (isPrime(i, primeList)) {
				primeList.add(i);
			}
		}
		return String.valueOf(primeList.size());
	}
	
	public static boolean isPrime (int n, List<Integer> primeList) {
		for (int prime : primeList) {
			if (n%prime==0) {
				return false;
			}
		}
		return true;
	}
	
}