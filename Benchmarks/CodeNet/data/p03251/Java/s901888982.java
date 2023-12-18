import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    int Y = Integer.parseInt(sc.next());
    
    int x = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      x = x < n ? n : x;
    }
    
    int y = 1000;
    for(int i = 0; i < M; i++){
      int n = Integer.parseInt(sc.next());
      y = y > n ? n : y;
    }
    
    String ans = "War";
    for(int i = x; i <= y; i++){
      if(X < i && i <= Y){
        ans = "No War";
      }
    }
    System.out.println(ans);
  }
}