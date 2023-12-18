import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num >= 10) {
			num = 0;
		}
		int disp = scanner.nextInt();
		int inner = disp + (num * 100);
		System.out.println(inner);
	}

}