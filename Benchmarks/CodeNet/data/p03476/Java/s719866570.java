import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		for(int q=1;q<=Q;q++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int c=0;
			if(l==3)c++;
			if((l+1)%4==0) {
				l=l+2;
			}
			else if(l==1) {
				l=5;
				c++;
			}
			for (int i=l;i<=r;i+=4) {
				if(isPrime(i)&&isPrime((i+1)/2))c++;
			}
			System.out.println(c);
		}
	}

	private static boolean isPrime(int i) {
		// TODO 自動生成されたメソッド・スタブ
		double rooti=Math.pow(i, 0.5)+1;
		for(int j=3;j<=rooti;j+=2) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}
}
