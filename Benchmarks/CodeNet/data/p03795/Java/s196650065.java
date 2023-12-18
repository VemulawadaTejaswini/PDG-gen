import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int num = 1;
		for (int i  = 1 ; i == N ; i++){
			num *=  i;
		}
		System.out.println(num/(100000000+7));
	}
}