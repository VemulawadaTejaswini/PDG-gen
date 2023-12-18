import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean j = false;

		int n = sc.nextInt();

		for(int i = 1; i < 10; i++) {
			if(n%i==0) {
				int a = n/i;
				if(0 < a &&  a < 10) {
					j = true;
					break;
				}
			}
		}

		System.out.println(j ? "Yes" : "No");
	}
}