import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int large = (b / k) * k;
	
		
		
		if(large >= a && large <= b) {
			System.out.println("OK");
		}
		else if(a == b && (k == 1 || k == a)) {
			System.out.println("OK");
		}
		else {
			System.out.println("NG");
		}
		
	}

}
