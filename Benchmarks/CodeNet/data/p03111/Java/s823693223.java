
import java.util.Scanner;
public class Main {
	
	static int inf = 1000000000;
	static int n;
	static int a;
	static int b;
	static int c;
	static int []l;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 n = Integer.parseInt(sc.next());
		
		 a = Integer.parseInt(sc.next());
		 b = Integer.parseInt(sc.next());
		 c = Integer.parseInt(sc.next());
		
		 l = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			l[i] = Integer.parseInt(sc.next());
		}
			
		System.out.println(dfs(0,0,0,0));

		
	}
	
	static int dfs(int cnt,int x, int y, int z) {
		
	if(cnt == n) {
		int ans = Math.abs(a-x) + Math.abs(b-y)+ Math.abs(c-z) - 30;
		if(Math.min(Math.min(x, y), z) <= 0) {
			return inf;
		}
		else {
			return ans;
		}
	}
	
	int ret0 = dfs(cnt+1,x, y ,z);
	int ret1 = dfs(cnt+1,x+l[cnt],y, z) + 10; 
	int ret2 = dfs(cnt+1,x, y+l[cnt] ,z) + 10;
	int ret3 = dfs(cnt+1,x,y,z+l[cnt]) + 10;
	
	return min(ret0,ret1,ret2,ret3);
	
		
	}
	
	static int min(int ret0,int ret1, int ret2, int ret3) {
		int a = Math.min(ret0, ret1);
		int b = Math.min(ret2, ret3);
		
		return Math.min(a, b);
	}
}
