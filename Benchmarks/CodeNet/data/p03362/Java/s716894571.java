import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=6;
		flag:for(int j=0;j<n;j++){
			while(i<=55555){
				if(isPrime(i)){
					System.out.print(i+" ");
					i+=5;
					continue flag;
				}
				i+=5;
			}
		}
	}
	public static boolean isPrime(int n) {
		if(n < 2) return false;
		if(n == 2) return true;
		if(n % 2 == 0) return false;

		for(int i = 3; i * i <= n; i += 2) {
			if(n % i == 0) return false;
		}
		return true;
	}
}