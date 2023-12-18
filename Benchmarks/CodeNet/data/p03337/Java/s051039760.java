import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String args[]) {
		TreeSet<Integer> result = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		result.add(a+b);
		result.add(a-b);
		result.add(a*b);
		
		System.out.println(result.last());
	}
}