import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		
		int cnt = 0;
		
		for (int i = a; i <= b; i++) {
			
			String tmp = String.valueOf(i);
			
			String rev = new StringBuilder(tmp).reverse().toString();
			
			if (tmp.equals(rev)) cnt++;
			
		}
		
		System.out.println(cnt);
		
	}

}