import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	/*void a() {
		String s = sc.next();
		char cbefore = s.charAt(0);
		for(int i = 1;i < s.length();i ++) {
			char c = s.charAt(i);
			if(cbefore == c) {
				System.out.println("Bad");
				return;
			}
			cbefore = c;
		}
		System.out.println("Good");
	}*/
	
	void doIt() {
		int n = sc.nextInt(), l = sc.nextInt();
		int min = 1000,sum = 0;
		for(int i = 1;i <= n;i ++) {
			int taste = l + i - 1;
			min = (Math.abs(min) > Math.abs(taste))?taste:min;
			//System.out.println(min);
			sum += taste;
		}
		System.out.println(sum-(int)(min));
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}