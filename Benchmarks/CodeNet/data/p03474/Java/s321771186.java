import java.util.Arrays;
import java.util.Scanner;

public class Main {
	char temp;
	void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String str = sc.next();
		for(int i = 0; i < a; i++) {
			 temp = str.charAt(i);
			 if('0'>temp || temp >'9') {
				 System.out.println("No");
				 return;
			 }
		}
		if(str.charAt(a) != '-') {
			System.out.println("No");
			return;
		}
		for(int i = a+1; i <= a+b; i++) {
			 temp = str.charAt(i);
			 if('0'>temp || temp >'9') {
				 System.out.println("No");
				 return;
			 }
		}
		System.out.println("Yes");
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}