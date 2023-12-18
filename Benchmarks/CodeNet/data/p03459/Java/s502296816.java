import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [][] data = new int[n][3];
			for(int i = 0; i < n;i++){
				data[i][0] = sc.nextInt();
				data[i][1] = sc.nextInt();
				data[i][2] = sc.nextInt();
			}
			
			int x = 0, y = 0, time = 0;
			boolean flg = true;
			for(int i = 0; i < n; i++){
				int dis = Math.abs(x - data[i][1]) + Math.abs(y - data[i][2]);
				int distime = data[i][0] - time;
				if(distime < dis){
					flg = false;
					break;
				}
				int diff = distime - dis;
				if(diff % 2 != 0){
					flg = false;
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
