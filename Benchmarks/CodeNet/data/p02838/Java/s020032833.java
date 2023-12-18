import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	final long mod=1000000007;
	int N=sc.nextInt();
	long ans=0;
	long A[]=new long[N];
	for(int i=0;i<N;i++) {
		A[i]=sc.nextLong();
	}
	for(int i=0;i<N-1;i++) {
		for(int j=i+1;j<N;j++) {
			ans+=(A[i]^A[j])%mod;
			ans%=mod;
		}
	}

System.out.println(ans%mod);
}
}
