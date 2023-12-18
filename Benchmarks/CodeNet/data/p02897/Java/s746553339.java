import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(0.5);
		}

		if(n % 2 == 0 && n!= 1) {
			System.out.println(0.6);
		}
		
		
		if(n== 1) {
			System.out.println(1);
		}
		
		
		

		sc.close();
	}
}

