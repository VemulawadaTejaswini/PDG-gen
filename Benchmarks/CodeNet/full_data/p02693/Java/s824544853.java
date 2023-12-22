import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		boolean bool = false;
		
		for(int i=a;i<=b;i++) {
			if(i % k == 0) {
				bool = true;
			}
		}
		
		if(bool) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}

	}

}
