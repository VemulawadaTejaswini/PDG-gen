import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int power = 1;
		
		for(int i=1;i<=N;i++){
			power *= i;
		}
		
		System.out.println(power % (Math.pow(10, 9) + 7));
	}

}
