import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int ans = 0;
    int max = 0;
    for(int i = 0; i < N; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      if(max < a){
        max = a;
        ans = a+b;
      }
    }
    System.out.println(ans);
  }
}