import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int h = Integer.parseInt(sc.next());
      int w = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());

      //char[][] c = new char[h][w];
      int[][] ans = new int[h][w];
      int cnt = 1;
      for(int i=0;i<h;i++){
        String s = sc.next();
        for(int j=0;j<w;j++){
          char c = s.charAt(j);
          if(c=='#'){
            ans[i][j] = cnt;
            cnt++;
          }
        }
      }

    }
}
