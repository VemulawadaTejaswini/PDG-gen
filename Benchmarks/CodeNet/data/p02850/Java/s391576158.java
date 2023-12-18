import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] inf = new int[N+1];
    int now = 0;
    int paint = 1;
    int[] ans = new int[N-1];
    int max = 0;
    
    for(int i = 0; i < N-1; i++){
      String[] S = sc.nextLine().split(" ");
      int a = Integer.parseInt(S[0]);
      int b = Integer.parseInt(S[1]);
      if(i == 0){
        now = a;
      }else{
        if(a == now){
          paint++;
        }else{
          now = a;
          paint = 1;
        }
        if(inf[a] == paint){
          paint++;
        }
      }
      ans[i] = paint;
      inf[b] = paint;
      if(max < paint){
        max = paint;
      }
    }

    System.out.println(max);
    for(int i : ans){
      System.out.println(i);
    }
  }
}
    
    