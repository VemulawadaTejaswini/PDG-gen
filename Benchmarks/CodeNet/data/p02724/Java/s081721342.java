import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long G = X/500;
    long r = X%500;
    long S = r/5;
    System.out.println(G*1000+S*5);
  }
  

  
}