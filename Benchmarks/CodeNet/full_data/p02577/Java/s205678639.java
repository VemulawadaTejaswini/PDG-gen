import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner(System.in);
		try {
		int N = scn.nextInt();

		int num = N;
        int s = 0;
        while(num != 0){
            s += num % 10;
            num /= 10;
        }
//        System.out.println(s);
        if (s >= 9) {
        	System.out.println(s % 9 == 0 ? "Yes" : "No");
        } else {
        	System.out.println("No");
        }
		} catch (InputMismatchException e) {
			System.out.println("No");
		}
	}
}
