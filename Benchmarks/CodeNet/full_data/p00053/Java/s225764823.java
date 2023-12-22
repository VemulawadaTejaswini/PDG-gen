import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] isPrime = new boolean[1000000];
	static int[] a;
	static int[] sum;
	static{
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		int count=0;
		int[] b = new int[100000];
		for(int i = 2; i*i<=isPrime.length; i++){
			if(isPrime[i]){
				
				for(int j = i+i; j < isPrime.length; j+=i){
					isPrime[j]=false;
				}
			}
		}
		
		for(int i = 0; i < isPrime.length; i++){
			if(isPrime[i]){
				b[count++]=i;
			}
		}
		a = new int[count];
		sum = new int[count+1];
		for(int i = 0; i < count; i++){
			
			a[i]=b[i];
			sum[i+1] = sum[i]+a[i];
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			System.out.println(sum[n]);
			
		}
	}

}