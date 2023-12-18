import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j=0;
		int sum=0;
		if(n>=5&&n<=55){
			flag:for(int i=0;i<n;i++){
				while(j<=257){
					if(isPrime(j)){
						sum += j;
						if((i==(n-1)&&(!isPrime(sum)))||(i>=0)&&(i<(n-1))){
							System.out.print(j+" ");
						}
						j++;
						continue flag;
					}
					j++;
				}
			}
		flag1:while(isPrime(sum)==true){
			sum-=(j-1);
			while(j<=257){
				j++;
				if(isPrime(j)){
					System.out.print(j+" ");
					sum+=j;
					break flag1;
				}
			}
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