import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    Main.an(s);

  }
 private static int njyou(int n){
   if(n==0){
     return 1;
   }else{
     return 2*njyou(n-1);
   }
 }

  private static int an(String a){
    if(a.length() == 1){
      return Integer.parseInt(a);
    }else{
      return njyou(a.length() -2)*Integer.parseInt(a.substring(0,0)) + an(a.substring(1,a.length() -1)) + Integer.parseInt(a);
    }
  }
}
