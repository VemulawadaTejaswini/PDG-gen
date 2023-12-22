import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner b = new Scanner(System.in);
		
		int n = b.nextInt();
		
		if(n/10 < 1) {
			if(n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
				System.out.println("hon");
			}
			if(n == 0 || n == 1 || n == 6 || n == 8) {
				System.out.println("pon");
			}
			if(n == 3) {
				System.out.println("bon");
			}
		}
		else if(n/10 >= 1 && n/10 < 10) {
			n = n%10;
			if(n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
				System.out.println("hon");
			}
			if(n == 0 || n == 1 || n == 6 || n == 8) {
				System.out.println("pon");
			}
			if(n == 3) {
				System.out.println("bon");
			}
		}
		else {
			n = n%100;
			n = n%10;
			if(n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
				System.out.println("hon");
			}
			if(n == 0 || n == 1 || n == 6 || n == 8) {
				System.out.println("pon");
			}
			if(n == 3) {
				System.out.println("bon");
			}
		}
		
	}

}
