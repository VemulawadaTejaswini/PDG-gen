import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int C[] = new int [N-1];//駅i+1にCi秒後に出発
    int S[] = new int [N-1];//開通式開始後Si秒後に駅iを発車
    int F[] = new int [N-1];//その後はFi秒おきに駅iを発車する
    
    for(int i=0; i<N-1; i++){
      C[i]=sc.nextInt();
      S[i]=sc.nextInt();
      F[i]=sc.nextInt();
    }
    
    for(int i=0; i<N-1; i++){
      int time = S[i] + C[i];
      for(int j=i+1; j<N-1; j++){
        if(S[j] > time){
          time = S[j];
        }
        
        if(time % F[j] != 0){
            time += F[i] -(time % F[i]);
        }
        time += C[j];
      }
      System.out.println(time);
    }
    System.out.println(0);
  }
}
    