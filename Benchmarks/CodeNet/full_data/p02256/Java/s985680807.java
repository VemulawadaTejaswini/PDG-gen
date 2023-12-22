import java.util.Scanner;

class Main {
	public static int gcd(int n1, int n2){
			if (n1 < n2) return gcd(n2,n1);
			if (n2 == 0) return n1;
			if (n1 == n2) return n1;
			return gcd(n2, n1%n2);
		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(gcd(a,b));
		
	}
}

