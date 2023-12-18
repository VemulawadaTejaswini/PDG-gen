import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int X=sc.nextInt();

		int count_bef=0;
		int count_aft=0;
		int ans=0;

		int[] A=new int[N+1];	//全部でN+1個の配列を準備

		for(int i=0;i<=N;i++) A[i]=0;	//初期条件で全部の配列に0を入れる

		for(int i=1;i<=M;i++){
			//料金所には1を格納
			int a=sc.nextInt();
			A[a]=1;
		}

		for(int j=1;j<=X;j++) {
			if(A[j]==1) count_bef++;
		}

	    for(int j=X+1;j<=N;j++) {
			if(A[j]==1) count_aft++;
		}

		if(count_bef<count_aft) ans=count_bef;
		else ans=count_aft;

		System.out.println(ans);

	}
}