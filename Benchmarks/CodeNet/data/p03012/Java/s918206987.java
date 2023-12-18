import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w[] = new int[n];
    for(int i = 0; i < n; i++){
      w[i] = sc.nextInt();
    }
    int ans = 99999;
    for(int i = 0; i < n-1; i++){
      int l = 0;
      int r = 0;
      for(int j = 0; j <= i; j++){
        l += w[j];
      }
      for(int j = i+1; j < n; j++){
        r += w[j];
      }
      ans = Math.min(ans,Math.abs(l-r));
    }
    System.out.print(ans);
  }
}
