import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    int x = 0;
    
    for(int i=1; i<=N; i++){
      x = x + L + i -1;
    }
    
    int y = 0;
    for(int i=1; i<=N; i++){
      if(L - 1 + i == 0){
        y = i;
      }
    }
    if(y == 0){
      if(L * L > (L + N - 1) * (L + N - 1)){
        y = N;
      }else {
        y = 1;
      }
    }
    System.out.println(x - L + 1 - y);
  }
}
         