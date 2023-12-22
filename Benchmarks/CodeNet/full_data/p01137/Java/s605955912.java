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
    int x,y,z;
    int ans = e;
    int m;
    int Cz;
    for(z = 0; z * z * z<= e ;z++){
      Cz = z * z * z;
      for(y = 0; y * y <= e - Cz; y++){
        x = e - (Cz + y * y);
        m = x + y + z;
        if(ans > m) ans = m;
      }
    }
    return ans;
  }
}