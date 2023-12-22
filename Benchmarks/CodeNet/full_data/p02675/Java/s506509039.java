import java.util.Scanner;
public class kadai {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = a % 10;
		if(b == 2 || b == 4 || b == 5 || b == 7 || b == 9) {
			System.out.println("hon");
		}if(b == 0 || b == 1 || b == 6 || b == 8) {
			System.out.println("pon");
		}if(b == 3){
			System.out.println("bon");
		}
	}

}
