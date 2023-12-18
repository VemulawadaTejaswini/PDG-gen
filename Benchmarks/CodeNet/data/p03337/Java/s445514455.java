import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A=scanner.nextInt();
		int B = scanner.nextInt();

		int add,sub,mul;
		add = A+B;
		sub = A-B;
		mul = A*B;

		int max = add;
		max = (sub>max)?sub:max;
		max= (mul>max)?mul:max;

		System.out.println(max);

	}

}
