import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double a = sc.nextDouble();
			
			double s = a;
			
			for(int i=2; i<=10; ++i){
				a = i%2==0 ? a*2. : a/3.;
				s += a;
			}
			
			System.out.println(s);
		}
		
		sc.close();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}