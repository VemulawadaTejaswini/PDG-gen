import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while (true) {
			if (a == 1) {
				a++;
				break;
			}
			if (a % 2 == 0) continue;
			boolean flg = true;
			for(int i = 2; i < a; i++) {
	            if(a % i == 0) {
	            	flg = false;
	            }
	        }
			if (!flg) {
				a++;
			} else {
				break;
			}
			
		}

			
		System.out.println(a);
	}

}