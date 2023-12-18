import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();

      int[][] x = new int[n][2];

      for(int i=0;i<n;i++){
        x[i][0] = sc.nextInt();
        x[i][1] = sc.nextInt();
      }

      int ans = 0;
      int cnt = -1;
      int max = 0;

      Arrays.sort(x, (a, b)->a[0]-b[0]);

      for(int i=1;i<=m;i++){
        for(int j=0;j<n;j++){
          if(x[j][0]<=i && x[j][1]>max){
            max = x[j][1];
            cnt = j;
          }
        }
        ans += max;
        if(cnt!=-1){
          x[cnt][1] = 0;
        }
        max = 0;
      }

      System.out.println(ans);

    }
}
