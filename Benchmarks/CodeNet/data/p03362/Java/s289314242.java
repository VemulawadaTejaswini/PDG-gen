import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int j=0;
		int sum=0;
		flag:for(int i=0;i<n;i++){
			while(j<=257){
				if(isPrime(j)&&junge(a,n,j)){
					a[i]=j;
					sum += a[i];
					j++;
					continue flag;
				}
				j++;
			}
		}
		flag1:while(isPrime(sum)==true){
			sum-=a[n-1];
			while(j<=257){
				if(isPrime(j)&&junge(a,n,j)){
					a[n-1]=j;
					sum+=a[n-1];
					j++;
					break flag1;
				}
				j++;
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}


	private static boolean junge(int[] a, int n,int j) {
		for(int i=0;i<n;i++){
			if(a[i]==j){
				return false;
			}
		}
		return true;
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