import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		long arr[] = new long[N];
		long p[] = new long[N];

		for(int n=0;n<N;n++){
			arr[n] = sc.nextLong();
			if(n==0) p[n] = arr[n];
			else p[n] = p[n-1] + arr[n];
		}


		long ans = 0;

		for(int n=0;n<N;n++){
			long r = p[n];
			for(int m=n;m<N;m++){
				
				if(p[m]%M==0){
					ans++;
				}
				p[m] -= r;

			}
		}

		System.out.println(ans);
	}
}