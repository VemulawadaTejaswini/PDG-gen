import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		if(2<n) System.out.println(2*n/gcd(2,n));
		else System.out.println(2*n/gcd(n,2));
	}

	static int gcd(int x,int y) {
		if(x%y==0)return y;
		else return gcd(y,x%y);
	}
}