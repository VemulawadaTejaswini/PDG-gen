
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}


	final int MAX_N = 1000000;
	boolean[] hurui = new boolean[MAX_N+1];
	int[] primeCount = new int[MAX_N+1];
	
	public Main() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		solve();
		while((str=sc.nextLine()) != null){
			System.out.println(primeCount[Integer.parseInt(str)]);
		}
	}

	public void solve() {
		int count = 0;
		for(int i=2;i<=MAX_N;i++){
			int t = i;
			if(hurui[t]){
				primeCount[t] = count;
				continue;
			}
			
			count++;
			primeCount[t] = count;
			while(t<=MAX_N){
				hurui[t] = true;
				t+=i;
			}
		}		
	}

}