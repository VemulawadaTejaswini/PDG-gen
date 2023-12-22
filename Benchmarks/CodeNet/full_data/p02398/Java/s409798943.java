import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;

		ArrayList<Integer> num = new ArrayList<Integer>();

		for(int i = a; i <= b; i++) {
			num.add(i);
		}
		for(int loop : num) {
			if(c % loop == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}

