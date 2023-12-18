import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    int[] t = new int[n];
    int totalTime = 0;
    for(int i=0; i<n; i++){
      t[i] = sc.nextInt();
      totalTime += t[i];
    }
    
    int m = sc.nextInt();

    int[][] p = new int[m][2];
    for(int i=0; i<m; i++){
      p[i][0] = sc.nextInt();
      p[i][1] = sc.nextInt();

      System.out.println(totalTime-t[p[i][0]]+p[i][1]);
    }
  }
}
