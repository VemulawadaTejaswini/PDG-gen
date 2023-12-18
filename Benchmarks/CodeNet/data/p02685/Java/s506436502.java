import java.util.Scanner;
public class Main {
	static int[][] gyo2=new int[100000][12];
	static int count=0;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long M=sc.nextLong();
		long K=sc.nextLong();
		long mod=998244353;
		long ans=0;
		if(K==0) {
			ans+=M;
			for(int j=0;j<N-1;j++) {
				ans*=M-1;
				ans%=mod;
			}
		}else {
		for(int i=0;i<K;i++) {
			long kari=0;
			kari+=M;
			for(int j=0;j<N-i-1;j++) {
				kari*=M-1;
				kari%=mod;
			}
			ans+=kari%mod;
			ans%=mod;
		}}
		System.out.println(ans);

	}
}
