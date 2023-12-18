
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		int L =scan.nextInt();
		int T =scan.nextInt();
		int[] X=new int[N];
		int[] W=new int[N];

		int[] x=new int[N];


		for(int i=0;i<N;i++){
			X[i]=scan.nextInt();
			W[i]=scan.nextInt();
			x[i]=X[i]+T*(3-2*W[i]);
			while(true)
			{
				if(x[i]>0)break;
				x[i]+=L;
			}
			x[i]%=L;

		}
		int x0 = x[0];
		Arrays.sort(x);

		int cnt=0;
		if(W[0]==1){
			for(int i=1;i<N;i++){
				if(W[i]==1){continue;}
					cnt+=(2*T-X[i]+X[0])/L+1;
				}
					cnt%=N;
		}else{
			for(int i=N-1;i>0;i--){
				if(W[i]==2){continue;}
					cnt-=(2*T-X[0]-L+X[i])/L+1;
				}
			while(true)
			{
				if(cnt>0)break;
				cnt+=N;
			}
			cnt%=N;
			}



		int ini=0;
		for(int i=0;i<N;i++){
			if(x[i]==x0){
				if(x[i+1]==x0){
					ini = i+1 - cnt;
				}
				ini = i-cnt;
				break;
			}
		}

		for(int i=0;i<N;i++){
			System.out.println(x[(ini+i+N)%N]);
		}



	}

}
