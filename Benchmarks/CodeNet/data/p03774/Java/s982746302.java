import java.util.*;

class Main {
	static final int INF = (1 << 30);

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
      	int[][] studentC = new int[n][2];
      	int[][] checkpointC = new int[m][2];
      	
      	for (int i = 0; i < n; i++) {
          	studentC[i][0] = Integer.parseInt(sc.next());
          	studentC[i][1] = Integer.parseInt(sc.next());
        }
      
      	for (int i = 0; i < m; i++) {
        	checkpointC[i][0] = Integer.parseInt(sc.next());
         	checkpointC[i][1] = Integer.parseInt(sc.next());
        }
      
      	for (int i = 0; i < n; i++) {
          int minDis = INF;
          int ans = 0;
        	 for (int j = 0; j < m; j++) {
                int x = Math.abs(studentC[i][0] - checkpointC[j][0]);     
                int y = Math.abs(studentC[i][1] - checkpointC[j][1]);
               	if (minDis > x + y) {
                  ans = j + 1;
                  minDis = x + y;
                }
             }
          System.out.println(ans);
        }
    }
}

/**
・static
・INF
・変数名
**/