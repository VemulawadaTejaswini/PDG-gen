import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i ++) {
			int num2 = sc.nextInt();
			if(num2 % 2 == 0 ) {
				if(num2 % 3 == 0 || num2 % 5 == 0) {
					System.out.println("APPROVED");
				}
			}else {
				System.out.println("DENIED");
		}
	}

}