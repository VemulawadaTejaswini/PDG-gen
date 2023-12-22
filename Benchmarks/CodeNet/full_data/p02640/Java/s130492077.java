import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int kame = (y - 2 * x) / 2;
		int turu = (4 * x - y) / 2;
		
		if(kame >= 0 && turu >= 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}