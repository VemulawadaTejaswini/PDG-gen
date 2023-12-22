import java.util.*;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s  = new Scanner(System.in);
    double T = s.nextDouble();
    double D = s.nextDouble();
    double S = s.nextDouble();
    double t = D/S;
    if(T >= t){
      System.out.println("Yes");
    }
     else{
       System.out.println("No");
     }
    
  }
}
  
