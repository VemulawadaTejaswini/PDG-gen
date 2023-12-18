import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count;
		if (n == 1 && m == 1) {
			count = 1;
		} else if (n == 1 || m == 1) {
			count = n * m - 2;
		} else {
			count = (n - 2) * (m - 2);
		}
		System.out.println(count);
	}
}
