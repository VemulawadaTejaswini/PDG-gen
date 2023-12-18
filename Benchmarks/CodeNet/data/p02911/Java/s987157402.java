import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int Q=sc.nextInt();
		int[] imos=new int[N+1];
		Arrays.fill(imos,0);
		for(int i=0; i<Q; i++) {
			int ans=sc.nextInt();
			if(ans==1) {
				imos[1]--;
				imos[N]++;
			}
			else if(ans==N) {
				imos[0]--;
				imos[N-1]++;
			}
			else {
				imos[0]--;
				imos[ans-1]++;
				imos[ans]--;
				imos[N]++;
			}
		}
		if(imos[0]+K>0) {
			p("Yes");
		}
		else {
			p("No");
		}
		for(int i=1; i<=N; i++) {
			imos[i]=imos[i]+imos[i-1];
			if(i<N && imos[i]+K>0) {
				p("Yes");
			}
			else if(i<N){
				p("No");
			}
		}
	}
	public static void p(Object o) {
		System.out.println(o);
	}
}