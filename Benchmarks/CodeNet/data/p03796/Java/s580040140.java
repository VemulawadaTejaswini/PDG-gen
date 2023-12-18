import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int num = 1;
		int power = 1;
		for (int i  = 1 ; i <= N ; i++){
			num *=  i;
		}
		power = num % (Math.pow(10,9) + 7);
		System.out.println(power);
	}
}