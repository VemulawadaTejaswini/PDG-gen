import java.math.BigInteger;
import java.util.*;

public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			
			int [] count = new int[3];
			for(int i =0; i < n; i++){
				if(data[i] <= a){
					count[0]++;
				}
				else if(data[i] <= b){
					count[1]++;
				}
				else{
					count[2]++;
				}
			}
			System.out.println(Math.min(count[0], Math.min(count[1], count[2])));
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
