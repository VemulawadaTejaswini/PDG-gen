import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void a() {
		int a = sc.nextInt(), b = sc.nextInt();
		String aStr = Integer.toString(a),bStr = Integer.toString(b);
		if(aStr.length() >= 2 || bStr.length() >= 2) {
			System.out.println("-1");
			return;
		}else {
			System.out.println(a*b);
		}
	}
	
	public static void main(String[] args) {
		new Main().a();
	}
}
