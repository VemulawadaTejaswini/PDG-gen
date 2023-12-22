import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(phi(n));
	}
	static int phi(int n){
		int ans=n;
		int tmp=n;
		if(!isPrime(n)){
			for(int i=2;i*i<=n;i++){
				if(tmp%i==0){
					ans-=(ans/i);
					while(tmp%i==0){
						tmp/=i;
					}
				}
			}
		}else{
			ans=n-1;
		}
		return ans;
	}
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}