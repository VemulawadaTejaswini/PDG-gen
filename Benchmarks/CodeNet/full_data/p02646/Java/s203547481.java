import java.util.*;

public class Main{
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    double A = sc.nextInt();
    double V = sc.nextInt();
    double B = sc.nextInt();
    double W = sc.nextInt();
    double T = sc.nextInt();
    
    if(V<=W){
       System.out.print("NO");
    }else{
      if(Math.abs(A - B) / Math.abs(V - W) <= T){
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
    } 
  }
}
    