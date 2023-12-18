import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			int [] data2 = new int[n];
			String s = sc.next();
			for(int i = 0; i < n; i++){
				data[i] = s.charAt(i) == 'W' ? 1 : 0;
				data2[i] = s.charAt(i) == 'E' ? 1 : 0;
			}
			
			int [] acc = new int[n];
			int [] acc2 = new int[n];
			acc[0] = data[0];
			acc2[n-1] = data2[n-1];
			for(int i = 1; i < n; i++){
				acc[i] = acc[i-1] + data[i];
			}
			for(int i = n-2; i >= 0; i--){
				acc2[i] = acc2[i+1] + data2[i];
			}
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++){
				int now;
				if(i == 0){
					now = acc2[1];
				}
				else if(i == n-1){
					now = acc[n-2];
				}
				else{
					now = acc[i-1] + acc2[i+1];
				}
				min = Math.min(min, now);
			}
			System.out.println(min);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
