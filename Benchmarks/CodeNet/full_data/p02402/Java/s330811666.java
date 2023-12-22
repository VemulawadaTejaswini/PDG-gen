import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int low = scan.nextInt();
		int high = scan.nextInt();
		int num = scan.nextInt();
		int count = 0;
		for (int i = low; i <= high; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println(count);
} 
}

