import java.util.*;

public class Main {
	long MOD = 1000000000 + 7;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int diff = Math.abs(a - b);
			if(diff >= 2){
				System.out.println(0);
				continue;
			}
			else if(diff == 0){
				long res = calc(a);
				long ans = (res * res) % MOD;
				ans = (ans * 2) % MOD;
				
				System.out.println(ans);
			}
			else{
				long res = (calc(a) * calc(b)) % MOD;
				System.out.println(res);
			}

		}
	}
	
	private long calc(long a){
			
		long res = 1;
		for(int i = 2; i <= a; i++){
			res = (res* a--) % MOD;
		}
		return res;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
