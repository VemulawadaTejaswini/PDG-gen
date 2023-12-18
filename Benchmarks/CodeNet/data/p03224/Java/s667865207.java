import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		if(N==1) {
			System.out.println("Yes");
			System.out.println("2");
			System.out.println("1");
			System.out.println("1");
		} else if(N==3) {
			System.out.println("Yes");
			System.out.println("3");
			System.out.println("2 1 2");
			System.out.println("2 2 3");
			System.out.println("2 3 1");
		} else {
			System.out.println("No");
		}
		
		sc.close();
	}
}
