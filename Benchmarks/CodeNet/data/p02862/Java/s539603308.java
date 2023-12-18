import java.util.*;

class Main {
  public static long mod = 1000000007;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    
    int a = 0;
    int b = 0;
    int u = 0;
    int v = 0;
    int ai = 0;
    int aj = 0;
    boolean flg = false;
    int k = 0;
    
    
    //long dp[][] = new long[x+2][y+2];
    
    if((x+y)%3 == 0){
      k = (x+y)/3;
    } else {
      System.out.println("0");
      return;
    }
    
    for(int i=0; i<x; i++){
      u = 2*i;
      v = i;
      if(u==x-(k-i) && v==y-2*(k-i)){
        flg = true;
        ai = i;
        aj = k-i;
      }
      if(flg) break;
    }
    
    if(ai < 0 || aj < 0){
      System.out.println("0");
      return;
    }
    
    long ans = ncr(ai+aj, ai);
    
    System.out.println(ans);
    
  }
  
  public static long ncr(int n, int r){
    long num = 1;
    for(int i = 1; i <= r; i++){
      num = num * (n - i + 1) / i % mod;
    }
    return num;
  }
  
}
