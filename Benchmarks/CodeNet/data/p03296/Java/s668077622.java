import java.math.BigInteger;
import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			
			int count = 0;
			int prev = data[0];
			for(int i = 1; i < n; i++){
				if(data[i] == prev){
					prev = -1;
					count++;
				}
				else{
					prev = data[i];
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
