import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		int i=1;
		while(i*i<=x) {
			i++;
		}
		
		System.out.println((i-1)*(i-1));
	}
}
