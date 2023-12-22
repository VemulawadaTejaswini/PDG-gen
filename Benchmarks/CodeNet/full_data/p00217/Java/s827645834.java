import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	private void doit() {
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			
			int max = 0;
			int ind = -1;
			for(int i = 0 ; i < n; i++){
				int id = sc.nextInt();
				int sum = sc.nextInt() + sc.nextInt();
				if(max < sum){
					max = sum;
					ind = id;
				}
			}
			System.out.println(ind + " " + max);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}