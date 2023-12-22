import java.util.*;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s  = new Scanner(System.in);
   
    int D = s.nextInt();
    int T = s.nextInt();
    int S = s.nextInt();
    double t = D/S;
    if(t <= T){
      System.out.println("Yes");
    }
     else{
       System.out.println("No");
     }
    
  }
}
  
