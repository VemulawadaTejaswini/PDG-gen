import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int temp = -1;
		if(a % 3 == 0 || b % 3 == 0) {
			temp = 0;
		}
		if((a + b) % 3 == 0) {
			temp = 0;
		}
		
		if(temp == 0) {
			System.out.println("Possible");
		}
		else {
			System.out.println("Impossible");
		}
	}

}
