import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		execute();
	}

	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			String str = sc.next();
			
			if(a %2 != 0) {
				System.out.println("No");
				return;
			}
			
			String x = str.substring(0, a/2);
			String y = str.substring(a/2, str.length());
			
			if(x.equals(y)) {
				System.out.println("Yes");
				return;
			}
			System.out.println("No");
		}
	}

}