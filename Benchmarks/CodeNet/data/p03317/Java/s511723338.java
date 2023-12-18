import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int index = -1;
    if(n == k){
      System.out.println(1);
      System.exit(0);
    }
    for(int i = 0; i < n; i++){
      if(sc.nextInt() == 1){
        index = i;
      }
    }
    //System.out.println(index);
    int ans = (int)Math.ceil((double)index / (k - 1));
    //System.out.println(ans);
    if(index == 0) ans = 1;
    index += (index > (k-1)) ? (k-1) - (index % (k - 1)) : (k - 1) - index;
    
    //System.out.println(index);
    ans += (int)Math.ceil((n - 1 - index) / (double)(k - 1));
    System.out.println(ans);
  }
}