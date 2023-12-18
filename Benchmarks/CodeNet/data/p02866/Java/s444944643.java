import java.util.Arrays;
import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	long N=sc.nextLong();
	long[] D=new long[(int) N];
	D[0]=sc.nextLong();
	if(N==1&&D[0]!=0) {
		System.out.println(0);
		System.exit(0);
	}
	for(int i=1;i<N;i++) {
		D[i]=sc.nextLong();
		D[i]-=D[0];
	}
	D[0]=0;
	Arrays.sort(D);
	long preCount=1;
	long nowCount=1;
	long ans=1;
	int flag=0;
	for(int i=0;i<N-1;i++) {
		if(D[i+1]==0) {
			System.out.println(0);
			System.exit(0);
		}
		if(D[i+1]==D[i]) {
			nowCount++;
		}else if(D[i+1]==D[i]+1) {
			if(flag==1) {
				ans*=Math.pow(preCount, nowCount);
				preCount=nowCount;
				nowCount=1;
			}else if(flag==0) {
			preCount=nowCount;
			nowCount=1;
			flag=1;
			}
		}else {
			System.out.println(0);
			System.exit(0);
		}
	}
	ans*=Math.pow(preCount, nowCount);
	System.out.println(ans%=998244353);
}

}