import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int cnt = 0;
			for(int i=2;i<=n;i++){
				if(prime(i)){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
	static boolean prime(int n){
		boolean isPrime = true;
		for (int i = 2; i <= n - 1; i++){
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}