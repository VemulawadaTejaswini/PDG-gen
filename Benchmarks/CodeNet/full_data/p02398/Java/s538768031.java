import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inf = scan.nextInt();
		int sup = scan.nextInt();
		int num = scan.nextInt();
		int count = 0;
		for (int i = inf; i < sup; i++) {
			if ((num % i) == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}