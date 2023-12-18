import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
		
			
		int na = n*a;
		
		if (na<b) {
			System.out.println(na);
		}else {
			System.out.println(b);
			
		}

	}

}
