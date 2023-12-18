import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();

		String result = "Yay!";

		if(Math.abs(a-b)>k) {
			result=":(";
		}
		if(Math.abs(a-c)>k) {
			result=":(";
		}
		if(Math.abs(a-d)>k) {
			result=":(";
		}
		if(Math.abs(a-e)>k) {
			result=":(";
		}
		if(Math.abs(b-c)>k) {
			result=":(";
		}
		if(Math.abs(b-d)>k) {
			result=":(";
		}
		if(Math.abs(b-e)>k) {
			result=":(";
		}
		if(Math.abs(c-d)>k) {
			result=":(";
		}
		if(Math.abs(c-e)>k) {
			result=":(";
		}
		if(Math.abs(d-e)>k) {
			result=":(";
		}

		System.out.print(result);
	}

}