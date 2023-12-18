import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			boolean flg = false;
			for(int i = 1; i < 10; i++){
				for(int j = 1; j < 10; j++){
					if(n == i * j){
						flg = true;
						break;
					}
				}
				if(flg){
					break;
				}
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
