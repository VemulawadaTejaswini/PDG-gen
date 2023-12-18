import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int count = 1;
		int sum = 0;

		for(int i = 1; sum  <= B; i++) {
			count++;
			sum += A * i;
		}

		System.out.println(count);
		//System.out.println(sum - (count-1));


	}

}