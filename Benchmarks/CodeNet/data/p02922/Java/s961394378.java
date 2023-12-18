import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int ans = 0;
    for(int i = 1; i < B;){
        i += (A-1);
        ans++;
    }
    System.out.println(ans);
  }
}