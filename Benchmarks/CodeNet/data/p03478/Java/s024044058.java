import java.util.Scanner;

public class Main {
	
	static int digit(int n) {
		if(1<=n && n<=9) return n;
		else {
			int a = n%10;
			n /= 10;
			return a + digit(n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum =0;
		int n = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			if(A<=digit(i) && digit(i)<=B) sum+=i;
		}
		
		System.out.printf("%d\n",sum);
	}
}
