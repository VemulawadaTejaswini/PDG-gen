import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int b = B*(N-2)+A+B;
    int a = A*(N-2)+A+B;
    
    int ans = Math.max(0, b-a+1);
    if(N==1 && A != B){
      ans = 0;
    }
    System.out.println(ans);
  }
}