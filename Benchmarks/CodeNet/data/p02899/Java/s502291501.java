import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[][] c = new int[n][2];
      for(int i=0;i<n;i++){
        c[i][0] = i+1;
        c[i][1] = Integer.parseInt(sc.next());
      }

      Arrays.sort(c, (a, b)->a[1]-b[1]);

      for(int i=0;i<n;i++){
        System.out.println(c[i][0]);
      }



    }
}
