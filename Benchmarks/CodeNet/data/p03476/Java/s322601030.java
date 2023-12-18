import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] isPrime=new boolean[100001];
		int[] c=new int[100001];
		for(int i=2;i<=100000;i++) {
			isPrime[i]=true;
		}
		for(int i=2;i<=100000;i++) {
			c[i]=c[i-1];
			if(isPrime[i]) {
				for(int j=2*i;j<=100000;j+=i) {
					isPrime[j]=false;
				}
				if(isPrime[(i+1)/2])c[i]++;
			}
		}
//		for(int i=2;i<=10;i++) {
//		System.out.println(c[i]);
//		}
		int Q = sc.nextInt();
		for(int q=1;q<=Q;q++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			System.out.println(c[r]-c[l-1]);
		}
	}

	private static boolean isPrime(int i) {
		// TODO 自動生成されたメソッド・スタブ
		double rooti=Math.pow(i, 0.5);
		for(int j=3;j<=rooti;j+=2) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}
}
//3 5 13 37 61 73
