import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 1;
		
		for(int i = 0; i < n - 1; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i + 1);
			if(c1 != c2) {
				ans++;
				
			}
		}
		
		System.out.println(ans);
		
		
		
		

	}

}
