import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(calc(sc.nextLong()));
    
  }
  
  public static long calc(long x){
    return x == 1 ? 1 : calc(x/2) + calc(x/2) + 1;
}
}