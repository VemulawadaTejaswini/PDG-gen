import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int trueN = n;
			int sum = 0;
			sc.close();
			while(n>=1){
				int k = n%10;
				sum=sum+k;
				n = (n - k) / 10;
			}
			if(trueN%sum==0) 
				System.out.println("Yes");
			else 
				System.out.println("No");
		}
	
	public static void main(String[] args) {
		solve();

	}

}
