import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int anss = 0;
		int j=0;
		int N = sc.nextInt();
		int X = sc.nextInt();
		//整数型配列の宣言と初期化
		int [] arys;
		arys = new int [N];
		
		for(int i=1; i<=N;i++)
		{		
		arys[i-1]=sc.nextInt();
		}
		for(j=1;ans<=X||j<=N;j++){
			ans=ans+arys[j-1];
		}
		
		if(ans<=X&&j==N)
		{anss=N+1;
		}
		if(ans<X&&j<N)
		{anss=j;
		}
		if(ans==X&&j<N)
		{anss=j+1;
		}
		
		
		System.out.println(anss);
		}
}
