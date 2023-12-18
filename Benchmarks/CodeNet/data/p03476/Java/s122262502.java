import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		int[] isPrime=new int[100002];

		for(int i=1; i<=100001; i+=2) {
			if(isPrime(i) && isPrime((i+1)/2)) {
				isPrime[i]=1;
			}
		}

		for(int i=1; i<=100001; i++) {
			isPrime[i]=isPrime[i-1]+isPrime[i];
		}
		Scanner sc=new Scanner(System.in);

		int Q=sc.nextInt();

		for(int i=0; i<Q; i++) {
			int s=sc.nextInt();
			int g=sc.nextInt();
			System.out.println(isPrime[g]-isPrime[s-1]);
		}
	}

	public static boolean isPrime(int a) {

		if(a<4) {

			if(a==2 || a==3) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			for(int j=2; j*j<=a; j++) {
				if(a%j==0) {
					return false;
				}
				if(a%j!=0 && (j+1)*(j+1)>a) {
					return true;
				}
		}
		return true;
		}
	}
}