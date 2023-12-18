import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int c[] = new int[n];
    int a[][] = new int[n][m];
    
    for(int i = 0 ; i < n ; ++i){
      c[i] = sc.nextInt();
      for(int j = 0 ; j < m ; ++j){
        a[i][j] = sc.nextInt();
      }
    }
    int ans = 1000000000;
    
    for(int i = 1 ; i < (1<<n) ; ++i){
      int k[] = new int[m];
      int l = 0;
      for(int j = 0 ; j < n ; ++j){
        if((i&(1<<j))==0){
          l += c[j];
          for(int o = 0 ; o < m ; ++o){
            k[o] += a[j][o];
          }
        }
      }
      for(int j = 0 ; j < m ; ++j){
        if(k[j] < x) break;
        if(j == m-1) ans = Math.min(ans,l);
      }
    }
    if(ans == 1000000000) System.out.println(-1);
    else System.out.println(ans);
    
  }
}