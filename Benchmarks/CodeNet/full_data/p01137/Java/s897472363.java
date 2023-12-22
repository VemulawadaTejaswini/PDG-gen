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
    double x,y,z,res;
    int ans = e;
    double m;
    double Cz;
    for(z = 0; Math.pow(z, 3) <= e ;z++){
      Cz = Math.pow(z,3);
      for(y = 0; Math.pow(y, 2) <= e - Cz; y++){
        x = e - (Cz + Math.pow(y, 2));
        m = x + y + z;
        if(ans > m) ans = (int)m;
      }
    }
    return ans;
  }
}