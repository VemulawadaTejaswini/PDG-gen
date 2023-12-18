import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int n = (B-A)*(N-2)+1;
    
    int ans = Math.max(0, n);
    if((N==1 && A != B) || N == 0){
      ans = 0;
    }
    System.out.println(ans);
  }
}