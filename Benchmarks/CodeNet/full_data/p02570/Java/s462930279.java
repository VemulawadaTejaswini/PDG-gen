import java.util.*;
public class Solution{
  public static void main(String[] args){
    Scanner s  = new Scanner(System.in);
    int T = s.nextInt();
    int D = s.nextInt();
    int S = s.nextInt();
    double t = D/S;
    if(T >= t){
      System.out.println("Yes");
    }
     else{
       System.out.println("No");
     }
    
  }
}
  