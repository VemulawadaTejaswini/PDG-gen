import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt();
		final long mod = 1000000007;
		int[] array = new int[n];
		for(int i=0;i<n;i++) array[i]=sc.nextInt();
		long count=0, temp=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]>array[j]) count++;
			}
		}
		count*=k;
		count%=mod;
		Arrays.sort(array);
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]<array[j]) {
					temp++;
				}
			}
		}
		temp*=(long)(k-1)*k%mod/2;
		temp%=mod;
		System.out.println(count+mod);
	}
}