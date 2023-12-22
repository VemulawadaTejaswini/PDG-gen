import java.util.*;

public class pair {
	int x;
	int y;
	
	pair(int x,int y){
		this.x= x;
		this.y= y;
	}

}


public class pair {
	int x;
	int y;
	
	pair(int x,int y){
		this.x= x;
		this.y= y;
	}
}

public class Main {
	static pair[]a;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		
		int N=sc.nextInt();
		a= new pair[N];
		
		for(int i=0;i<N;i++){
			int x= sc.nextInt();
			int y= sc.nextInt();
			
			a[i]= new pair(x,y);
			
		}
		
		sc.close();
		
		int ans=0;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(i == j)continue;
				int d= dist(a[i],a[j]);
				if(ans < d)ans= d;
			}
		}
		
		System.out.println(ans);
		
	}

	
	static int dist(pair i,pair j){
		int res=  Math.abs(i.x- j.x)+ Math.abs(i.y- j.y);
		return res;
	}
}
