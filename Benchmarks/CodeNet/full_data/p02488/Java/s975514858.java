import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String min = sc.next();
		for(int i=0; i<n-1; i++) {
			String x = sc.next();
			if(x.compareTo(min) < 0) {
				min = x;
			}
		}
		System.out.println(min);
	}
}