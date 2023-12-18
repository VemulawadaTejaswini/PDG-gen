import java.util.Arrays;
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
	Arrays.sort(A);
	long karinum=0;
	for(int j=1;j<N;j++) {
		ans+=(A[0]^A[j]);
	}
	karinum=ans;
	for(int i=1;i<N-1;i++) {
		if(A[i]==A[i-1]) {
			karinum-=A[i-1]^A[i];
			ans+=karinum%mod;
			continue;
		}else {
			karinum=0;
			ans%=mod;
		}
		for(int j=i+1;j<N;j++) {
			ans+=(A[i]^A[j]);
			karinum+=A[i]^A[j];
			ans%=mod;
		}
	}

System.out.println(ans%mod);
}
}