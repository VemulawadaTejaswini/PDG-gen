import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    Integer[] d = new Integer[n];
    for (int i = 0; i < n; i++){
      d[i] = Integer.parseInt(sc.next());
      // 右辺はint型だがオートボクシングされている
    }
    Arrays.sort(d,(n1,n2) -> {return n2 - n1;});
    int ans = 0, last = 101;
    for (int i = 0; i < n; i ++){
      if (last != d[i]){
        ans += 1;
        last = d[i];
      }
    }
    System.out.println(ans);
    
  }
}
