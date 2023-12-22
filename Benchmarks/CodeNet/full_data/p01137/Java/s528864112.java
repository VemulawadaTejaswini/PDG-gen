import java.util.*;
public class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String [] args){
    int e;
    while(true){
      e = sc.nextInt();
      if(e == 0)break;
      System.out.println(solve(e));
    }
  }
  static int solve(int e){
    double x,y,z;
    int ans = e;
    double m;
    for(z = 0; Math.pow(z, 3) <= e ;z++){
      for(y = 0; Math.pow(y, 2) <= e; y++){
        for(x = 0; x <= e; x++){
          if(Math.pow(z, 3) + Math.pow(y,2) + x == e){
            m = x + y + z;
            ans = Math.min(ans, (int)m);
          }
        }
      }
    }
    return ans;
  }
}