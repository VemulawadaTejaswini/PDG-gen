import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    //int k = scan.nextInt();
    if (n == 0) {
      	System.out.println(0);
    	return;
    }
    int[][] act = new int[n][3];
    int[] dp1 = new int[n];
    int[] dp2 = new int[n];
    int[] dp3 = new int[n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        act[i][j] = scan.nextInt();
      }      
    }
    scan.close();

    Arrays.fill(dp1, Integer.MIN_VALUE);
    Arrays.fill(dp2, Integer.MIN_VALUE);
    Arrays.fill(dp3, Integer.MIN_VALUE);
    dp1[0] = act[0][0];
    dp2[0] = act[0][1];
    dp3[0] = act[0][2];

	for (int i = 1; i < n; i++) {
      dp1[i] = Math.max(dp2[i-1], dp3[i-1]) + act[i][0];
	  dp2[i] = Math.max(dp1[i-1], dp3[i-1]) + act[i][1];
      dp3[i] = Math.max(dp1[i-1], dp2[i-1]) + act[i][2];
    }

                                      
    System.out.println(max(dp1[n-1], dp2[n-1], dp3[n-1]));
  }
                                      
  private static int max(int a, int b, int c) {
  	return Math.max(a, Math.max(b,c));
  }
}