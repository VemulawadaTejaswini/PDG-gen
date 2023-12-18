import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int A=scan.nextInt();
		int B=scan.nextInt();

		long[]v = new long[N];
		for(int i=0;i<N;i++){
			v[i]=scan.nextLong();
		}
		Arrays.sort(v);

		long sumv=0;
		double average=0;
		for(int i=0;i<A;i++){
			sumv+=v[N-1-i];
		}
		average=(double)(sumv)/A;
		System.out.println(BigDecimal.valueOf(average).toPlainString());

		if(v[N-A]==v[N-1]){
			//全部同じ
			int cnt=0;
			for(int i=0;i<N;i++){
				if(v[i]==v[N-1]){
					cnt++;
				}
			}
			//cntからA個とる組み合わせ+A+1個とる組み合わせ+....+B個とる組み合わせ
			long com = 0;
			for(int i=A;i<=B;i++){
				com+=combination(cnt,i);
			}
			System.out.println(com);


		}else{
			int cnt=0;
			for(int i=0;i<N;i++){
				if(v[i]==v[N-A]){
					cnt++;
				}
			}
			int A_=0;
			for(int i=N-A;i<N;i++){
				if(v[i]==v[N-A]){
					A_++;
				}
			}
			//cntからA_個とる組み合わせ
			System.out.println(combination(cnt,A_));


		}



	}

	static long combination(int n,int k){
		//nCk
		int k_=n-k;
		long ans=1;

		int temp=1;
		for(int i=1;i<=k_;i++){
			ans*=temp;
			ans/=i;
			temp++;
		}
		for(int i=1;i<=k;i++){
			ans*=temp;
			ans/=i;
			temp++;
		}

		return ans;

	}

}
