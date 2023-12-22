import java.util.Scanner;

/*
 * 何回目の探索で来たのかを入れておく
 * 同じ回数目の探索ならループで、違うならもう既にそのループはカウント済み
 */
class E{
	int loop;
	int x;
	int y;
	
	E(int a,int b){
		loop=0;
		x=a;
		y=b;
	}
	
}
public class Main {
	E map[][];
	int count,sx,sy;
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			map=new E[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					int a=sc.nextInt();
					int b=sc.nextInt();
					map[j][i]= new E(a,b);
				}
			}
			int c=1;
			count=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(map[j][i].loop==0){
						sx=j;sy=i;
//						System.out.println("!");
						solve(j, i, c);
						c++;
						//count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	
	void solve(int mx,int my,int c){
//		System.out.println(mx+" "+my+"  "+map[mx][my].x+" "+map[mx][my].y);
		
		if(0<map[mx][my].loop){
			if(c==map[mx][my].loop){
				count++;
			}
				return;
		}
		
		int a=map[mx][my].x;
		int b=map[mx][my].y;
		
		map[mx][my].loop=c;
		
		solve(a, b, c);
	}

}