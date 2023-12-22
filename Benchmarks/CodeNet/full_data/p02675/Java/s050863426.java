import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		n = n % 10;
		
		if (n == 3) {
			System.out.println("bon");
		} else if(n == 0 || n == 1 || n == 6 || n == 8) {
			System.out.println("pon");
		} else {
			System.out.println("hon");
		}

        sc.close();
	}
}