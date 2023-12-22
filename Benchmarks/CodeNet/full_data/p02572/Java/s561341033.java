import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long ans=0;
		long[] A=new long[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				ans+=(A[i]*A[j])%(Math.pow(10,9)+7);
              	ans%=(Math.pow(10,9)+7);
			}
		}
		System.out.println(ans);
		
		
	}
}
