import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		scan.close();
		
		long power = 1;
		
		for(int i = 1; i <= n; i++){
			power *= i;
			power %= 1000000007;
		}
		System.out.print(power);
	}
}