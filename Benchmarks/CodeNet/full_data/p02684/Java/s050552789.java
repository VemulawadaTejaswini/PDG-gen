import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n_copy=n;
		long k = sc.nextLong();
		//long h = k%n;
		long k_copy = k;
		//System.out.println(h);
		int[] arr = new int[n+1];
		for(int i=1;i<=n;i++){
			arr[i]=sc.nextInt();
		}
		if(k<=n){
			int a = 1;
			int b = 0;
			while(k_copy>0){
				b=arr[a];
				a=b;
				k_copy--;
			}
			System.out.println(b);

		}
		else{
			int a =1;
			int b=0;
			while(n_copy>0){
				b=arr[a];
				a=b;
				n_copy--;
			}
			long h = k%n;
			while(h>0){
				b=arr[a];
				a=b;
				h--;
			}
			System.out.println(b);

		}
		
		
	}
}