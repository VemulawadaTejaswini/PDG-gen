import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());

    int[] h = new int[n];
    for(int i=0; i<n; i++)
      h[i] = Integer.parseInt(sc.next());

    int[][] r = new int[2][m];
      for(int i=0; i<m; i++){
        r[0][i] = Integer.parseInt(sc.next());
        r[1][i] = Integer.parseInt(sc.next());
      }
      
      int t = n;

      for(int i=0; i<m; i++){
        if(h[r[0][i]-1] > h[r[1][i]-1]){
          int k = r[0][i];
          r[0][i] = r[1][i];
          r[1][i] = k;
        }else if(h[r[0][i]-1] == h[r[1][i]-1]){
          for(int l=i+1; l<m; l++)
          if(!(r[0][i] == r[0][l] && r[1][i] == r[0][l]))
            t--;
        }
      }
      
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
          if(r[0][j] == i){
            t--;
            break;
          }
        }
      }
      System.out.println(t);
  }
}
