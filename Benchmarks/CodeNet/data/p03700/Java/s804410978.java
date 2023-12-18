import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long h[] = new long[N];
		for(int i=0; i<N; i++){
			h[i]=sc.nextLong();
			
		}
		Arrays.sort(h);
		long times=0;
		long maximum = h[N-1];
		int T=1;
		if(h[N-1]/A>100000){
			A=A*10000;
			B=B*10000;
			T=10000;
		}
		int flag=0;
		while(h[N-1]>0){
			h[N-1]-=A;
			times=times+T;
			if(h[N-1]<0&&T==10000){
				h[N-1]+=A;
				flag=1;
				A=A/10000;
				B=B/10000;
				times=times-T;
				T=1;
			}
			if(flag==0){
			maximum = h[N-1];
			for(int i=0; i<N-1; i++){
				h[i]-=B;
				if(h[i]>maximum){
					maximum=h[i];
					long tmp=h[N-1];
					h[N-1]=h[i];
					h[i]=tmp;
				}
				}
			}
			flag=0;
		}
		System.out.println(times);
	}
}