import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] isPrime = new boolean[50001];
	static int[] a = new int[10];
	static{
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i = 2; i*i<= isPrime.length;i++){
			if(isPrime[i]){
				for(int j = i+i; j < isPrime.length;j+=i){
					isPrime[j]=false;
				}
			}
		}
		int count=0;
		for(int i = 0; i < isPrime.length;i++){
			if(isPrime[i]){
				count++;
			}
		}
		a = new int[count];
		count=0;
		for(int i = 0; i < isPrime.length;i++){
			if(isPrime[i]){
				a[count++]=i;
			}
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int count=0;
			int lim = Arrays.binarySearch(a, n);
			if(lim < 0){
				lim = lim*(-1) -1;
			}
			for(int i = 0; i < lim;i++){
				for(int j = i; j < lim; j++){
					if(a[i]+a[j]==n){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}