import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int res = 0;
		if ( (A+B)>24 ) res = (A+B)-24;
		else if ( (A+B)<24 ) res = 24 + (A+B);
		else res = A+B;
		System.out.println(Math.abs(res));
	}
}
