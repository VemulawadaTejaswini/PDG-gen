import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[][] inf = new int[N+1][2];
    int now = 0;
    int paint = 1;
    for(int i = 0; i < N-1; i++){
      String[] S = sc.nextLine().split(" ");
      int a = Integer.parseInt(S[0]);
      int b = Integer.parseInt(S[1]);
      inf[b][0] = a;
      inf[b][1] = paint;
      if(i == 0){
        now = a;
        System.out.println(paint);
      }else{
        if(a == now){
          paint++;
          System.out.println(paint);
        }else{
          now = a;
          paint = 1;
          if(inf[a][1] == paint){
            paint++;
          }
          System.out.println(paint);
        }
      }
    }
  }
}
    
    