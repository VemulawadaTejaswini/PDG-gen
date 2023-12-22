import java.util.Arrays;
import java.util.Scanner;


public class Main{
	Scanner sc;
	
	void solve(){
		sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			boolean list = new boolean[11];
			Arrays.fill(list, true);
			int sum = 0;
			
			for(int i=0; i<3; ++i){
				int v = ni();
				if(i+1 < 3){
					sum += v;
				}
				list[v] = false;
			}
			
			int n=0;
			for(int i=1; i<=10; ++i){
				if(list[i] && sum+i<=20){
					++n;
				}
			}
			
			System.out.println(3<n ? "YES" : "NO");
		}
		
		sc.close();
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	public static void main(String[] args){
		new Main().solve();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}