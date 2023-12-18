import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();
		int s=0;
		for(int i=1; i<=K; i++) {
			for(int j=1; j<=K; j++) {
				for(int k=1; k<=K; k++) {
					s+=gcd(gcd(i,j),k);
				}
			}
		}
		System.out.println(s);
	}

	public static int gcd(int a, int b) {
		int r;
		while((r = a%b) != 0) {
			a=b;
			b=r;
		}
		return b;
	}

}
