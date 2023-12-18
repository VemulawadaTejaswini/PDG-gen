import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    long A = Long.parseLong(S[0]);
    long B = Long.parseLong(S[1]);
    long x = Long.parseLong(S[2]);
    
    long a = (A-1) / x;
    if(A == 0){
      a = -1;
    }
    long b = B / x;
    long ans = b - a;
    System.out.println(ans);
  }
}