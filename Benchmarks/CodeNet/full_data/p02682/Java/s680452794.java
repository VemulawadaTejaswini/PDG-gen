import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputa = sc.nextInt();
		int inputb = sc.nextInt();
		int inputc = sc.nextInt();
		int inputk = sc.nextInt();

		int result = 0;
		if(inputk <= inputa) {
			result = inputk;
		}
		else if(inputk <= inputa + inputb) {
			result = inputa;
		}
		else if(inputk < inputa + inputb + inputc) {
			result = inputa - (inputk - inputa - inputb);
		}else {
			result = inputa - inputc;
		}
		System.out.println(result);
	}
}