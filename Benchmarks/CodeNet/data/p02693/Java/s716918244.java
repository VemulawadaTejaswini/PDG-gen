import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();

		String[] numbers = num.split(" ");
		int A = Integer.parseInt(numbers[0]);
		int B = Integer.parseInt(numbers[1]);

		int b = A/K;
		int c = (b+1)*K;

		if(c<=B) {
			System.out.println("OK");
		}else if(A==B&&A%K==0) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
}