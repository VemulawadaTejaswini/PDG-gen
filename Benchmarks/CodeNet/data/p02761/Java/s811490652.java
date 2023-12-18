import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    boolean [] a = new boolean[n];
    int [] g = new int[n];
    for (int t = 0;t<n;t++){
      a[t] = true;
      g[t] = 0;
    }

    for (int i=0; i<m; i++){
      int b = scan.nextInt();
      if (a[b-1] == false){
        int gg = scan.nextInt();
        if (gg != g[b-1]){
          System.out.println(-1);
          return;
        }
      }
      else{
        a[b-1] = false;
        int c = scan.nextInt();
        g[b-1] = c;
        if (b == 1){
          if (c==0){
            System.out.println(-1);
            return;
          }
        }
      }
    }
    
    for (int t = 0;t<n;t++){
      System.out.print(g[t]);
    }
    System.out.println("");
  }
}
