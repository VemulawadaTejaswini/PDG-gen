import java.math.BigInteger;
import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int n = sc.nextInt();
			
			long count = 0;
			for(int i = 0; i <= n; i ++){
				for(int j = 0; j <= n; j++){
					long k = (long)n - (long)i * a - (long)j * b;
					if(k < 0) continue;
					if(k % c == 0){
						count++;
					}
				}
			}
			System.out.println(count);
			
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
