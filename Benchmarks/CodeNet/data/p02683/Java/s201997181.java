import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    
    int[][] array = new intp[n][m];
    
    int check1 = 0;
    int check2 = 0;
    
    for (int i = 0; i < n; i++) {
      for (int h = 0; h < m; h++) {
        array[i][h] = sc.nextInt();
      }
    }
    
    for (int i = 0; i < m; i++) {//全部足して行かない奴がないかチェック
      int sum = 0;
      for (int h = 0; h < n; h++) {
        sum += array[h][i];
      }
      
      if (sum < x){
        System.out.println(-1);
        return;
      }
        
    }
  }
}
    
    