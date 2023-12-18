import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		
		print(x, n);
	}
	
	public static void print(int x,int n){
		int max =  n * 2 - 1;
		if (x == 1 || x == max) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
		
		IntStream.range(x + n, x + n + max)
			.map(e -> e % max + 1)
			.forEach(System.out::println);
	}
}
