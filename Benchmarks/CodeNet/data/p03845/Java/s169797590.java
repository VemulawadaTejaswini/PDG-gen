
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int N;
	int[] T;
	int M;
	int[] P;
	int[] X;
	int sum=0;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		T=new int[N];
		for(int i=0;i<N;i++){
			T[i]=sc.nextInt();
			sum+=T[i];
		}
		M=sc.nextInt();
		P=new int[M];
		X=new int[M];
		for(int i=0;i<M;i++){
			P[i]=sc.nextInt();
			X[i]=sc.nextInt();
		}
		
		for(int i=0;i<M;i++){
			System.out.println(sum-T[P[i]-1]+X[i]);
		}
	}
}