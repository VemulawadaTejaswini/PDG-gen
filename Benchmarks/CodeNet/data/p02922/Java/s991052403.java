import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int ans = 1;
    for(int i = A; i < B; i++){
      i += (A-1);
      ans++;
    }
    System.out.println(ans);
  }
}