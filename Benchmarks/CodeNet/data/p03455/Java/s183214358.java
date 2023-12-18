import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.print("a: ");
		a = input.nextInt();
		System.out.print("b: ");
		b = input.nextInt();
		int c = a*b;
		if(c%2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}

	}

}