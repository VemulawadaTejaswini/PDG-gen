import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1 == num2 && num1 != num3) {
			System.out.println("Yes");
		}else if(num1 == num3 && num1 != num2){
			System.out.println("Yes");
		}else if(num2 == num3 && num2 != num1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}