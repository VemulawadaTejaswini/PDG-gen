import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2,num3;
		int count = 0;
		num1 =in.nextInt(); num2 = in.nextInt(); num3 = in.nextInt();
		for (int i = num1; i <= num2; i++) {
			if (i%num3==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
