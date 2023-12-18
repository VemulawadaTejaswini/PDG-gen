import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();

		for (int i=1; i<=9&&k>0; i++){
			System.out.println(i);
			k--;
		}
		for (int i=1; i<=9&&k>0; i++){
			System.out.println(i*10+9);
			k--;
		}
		for (int e=2; k>0; e++){
			long a = (long)Math.pow(10, e);
			for (int i=e-1; i<=10*e-1&&k>0; i++){
				System.out.println((i+1)*a-1);
				k--;
			}
		}
	}
}