import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			for(int i = n; i >= 0; i--){
				long sum = (long)(1 + i) * i / 2;
				if(sum == n){
					System.out.println(i);
					break;
				}
				else if(sum < n){
					System.out.println(i+1);
					break;
				}
			}
			
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
