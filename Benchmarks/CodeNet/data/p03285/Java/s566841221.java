import java.math.BigInteger;
import java.util.*;

public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			boolean flg = false;
			for(int i = 0; i < 100; i++){
				for(int j = 0; j < 100; j++){
					int sum = i * 4 + j * 7;
					if(sum == n){
						flg = true;
						break;
					}
				}
				if(flg) break;
			}
			System.out.println(flg ? "Yes" : "No");
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
