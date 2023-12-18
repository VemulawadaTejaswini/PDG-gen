import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] n = new int[N];
    for(int i = 0; i < M; i++){
      int s = sc.nextInt();
      int c = sc.nextInt();
      if(n[s - 1] == 0 || n[s - 1] == c){
        n[s - 1] = c;
      } else {
        System.out.println("-1");
        System.exit(0);
      }
    }
    if(n[0] == 0){
      System.out.println("-1");
    } else {
      for(int i = 0; i < N; i++){
        System.out.print(n[i]);
      }
    }
  }
}
