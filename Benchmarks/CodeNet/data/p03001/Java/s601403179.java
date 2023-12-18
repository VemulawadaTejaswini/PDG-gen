import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    long W = Long.parseLong(S[0]);
    long H = Long.parseLong(S[1]);
    long x = Long.parseLong(S[2]);
    long y = Long.parseLong(S[3]);
    
    Long s1 = Math.min(W*y, W*(H-y));
    Long s2 = Math.min(H*x, H*(W-x));
    
    System.out.print(Math.max(s1, s2));
    System.out.print(" ");
    System.out.println(s1==s2 ? 1 : 0);
  }
}