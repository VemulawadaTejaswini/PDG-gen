import java.math.BigInteger;
import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			String [] data = new String[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.next();
			}
			
			int count = 0;
			int pre = 0, suf = 0;
			for(int i = 0; i < n; i++){
				for(int j = 1; j < data[i].length(); j++){
					if(data[i].charAt(j-1) == 'A' && data[i].charAt(j) == 'B'){
						count++;
					}
				}
				if(data[i].charAt(0) == 'B') {
					pre++;
				}
				if(data[i].charAt(data[i].length()-1) == 'A'){
					suf++;
				}
			}
			
			System.out.println(count + Math.min(pre, suf));
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
