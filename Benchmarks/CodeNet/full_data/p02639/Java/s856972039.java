
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		for(int i = 1; i <= 5; i++) {
			int tmp = sc.nextInt();
			if(tmp == 0) result = i;
		}
		System.out.println(result);
	}

}
