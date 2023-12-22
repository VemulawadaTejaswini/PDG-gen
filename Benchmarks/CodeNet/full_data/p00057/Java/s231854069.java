import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int base = 2;

		for(int i = 2; i <= num; i++){
			base += i;
			}

		System.out.println(base);
	}

}