import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;
		if (sum % 2 == 0) {
			System.out.println("Yes");
		} else if(sum % 2 == 1){
			System.out.println("No");
		}
	}
}