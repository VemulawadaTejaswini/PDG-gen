import java.util.Scanner;

public class Main {
	private static Scanner sc;
	private static int n;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		n=sc.nextInt();
		PrimeFactorize(n);
	}
	static void PrimeFactorize(int x){
		System.out.print(x+":");
		if(!isPrime(x)){
			int i=2;
			while(x!=1){
				while(x%i==0){
					System.out.print(" "+i);
					x/=i;
				}
				i++;
				while(!isPrime(i)){
					i++;
				}
			}
		}else{
			System.out.print(" "+x);
		}
		System.out.println();
	}
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n)+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}