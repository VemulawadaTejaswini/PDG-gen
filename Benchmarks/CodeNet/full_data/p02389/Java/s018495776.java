import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int num2 = scan.nextInt();

		int num3 = num*num2;
		int num4 = num*2+num2*2;

		System.out.println(num3+" "+num4);



	}

}