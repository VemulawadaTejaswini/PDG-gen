import java.util.*;

public class Main{
  public static void main(String...args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(), l = s.nextInt();
    int c[] = new int[n], t[] = new int[n];
    int mincost = 0;
    boolean chk = false;
    for(int i = 0;i < n;i++){
      c[i] = s.nextInt(); t[i] = s.nextInt();
      if((i == 0 || mincost >= c[i]) && l >= t[i]){
        mincost = c[i];
        chk = true;
      }
    }
    if(!chk){
      System.out.println("TLE");
    }else{
      System.out.println(mincost);
    }
  }
}