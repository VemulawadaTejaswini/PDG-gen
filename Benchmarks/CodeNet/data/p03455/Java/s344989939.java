import java.util.*;

public class Main{
  public static void main(String[] args){
    int a,b,c;
    
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
    
    c = a*b;
    
    if(c % 2 == 0) System.out.println("even");
    else System.out.println("odd");
  }
}