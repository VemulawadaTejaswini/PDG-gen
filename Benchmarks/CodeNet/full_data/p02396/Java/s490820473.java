import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int i = 0;
		while(x != 0) {
			System.out.println("case " + i +": " + x);
			x = scanner.nextInt();
			i++;
		}
	}
}

