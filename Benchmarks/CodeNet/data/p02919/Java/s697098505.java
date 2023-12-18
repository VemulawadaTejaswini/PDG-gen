import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] P = new int[N];
    for(int i = 0; i < N; i++){
      P[i] = Integer.parseInt(sc.next());
    }
    
    int sum = 0;
    for(int i = 0; i < N-1; i++){
      int X = P[i];
      int a = 0, b = 0;
      for(int j = i+1; j < N; j++){
        int Y = P[j];
        if(j == i+1){
          b = Math.min(X, Y);
          a = Math.max(X, Y);
        }else{
          if(Y >= a){
            b = a;
            a = Y;
          }else if(Y > b){
            b = Y;
          }
        }
        sum += b;
      }
    }
    System.out.println(sum);
  }
}