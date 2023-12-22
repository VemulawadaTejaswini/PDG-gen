import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	private void doit(){
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [][] data = new int[n + 1][4];
			for(int i = 0; i <= n; i++){
				for(int j = 0; j < 4; j++){
					data[i][j] = sc.nextInt();
				}
			}
			boolean NA = true;
			for(int i = 0; i < n; i++){
				int nowC = 4 * data[i][1] + 9 * data[i][2] + 4 * data[i][3];
				if(data[i][1] <= data[n][0] && data[i][2] <= data[n][1] && data[i][3] <= data[n][2] && nowC <= data[n][3]){
					NA = false;
					System.out.println(data[i][0]);
				}
			}
			if(NA) System.out.println("NA");
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}