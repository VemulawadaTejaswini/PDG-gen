import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int X_max = -200;
    int Y_min=200;

    for(int i=0;i<N;i++){
    int x=sc.nextInt();
      if(x>X_max){
        X_max=x;
      }
    }
    for(int i=0;i<M;i++){
    int  y=sc.nextInt();
      if(y<Y_min){
        Y_min=y;
      }
    }

    for(int Z=X+1;Z<Y;Z++){
      if(X_max<Z && Z<=Y_min){
        System.out.println(Z);
        System.out.println("No War");
        break;
      }
      if(Z==Y-1){
        System.out.println("War");
      }
    }
  }


}
