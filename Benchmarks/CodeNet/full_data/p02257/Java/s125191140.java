import java.util.Scanner;


public final class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int count=0;
//		boolean[] isP = eratos(20);
		boolean[] isP = eratos(100000000);
		for (int i=0;i<n;i++) {
			if (isP[scan.nextInt()])count++;
		}
		System.out.println(count);
	}
	static boolean[] eratos(int n) {
		boolean[] isPrime = new boolean[n+1];
		for (int i=2;i<n+1;i++)isPrime[i]=true;
		for (int i=2;i*i<=n+1;i++) {
			int k=2;
			while (i*k<n+1)isPrime[i*(k++)]=false;
		}
		return isPrime;
	}
}