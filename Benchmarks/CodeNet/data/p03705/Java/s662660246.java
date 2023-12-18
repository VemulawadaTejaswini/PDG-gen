import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());
    
    long n = (B-A)*(N-2)+1;
    
    long ans = Math.max(0, n);
    if((N==1 && A != B) || N == 0){
      ans = 0;
    }
    System.out.println(ans);
  }
}