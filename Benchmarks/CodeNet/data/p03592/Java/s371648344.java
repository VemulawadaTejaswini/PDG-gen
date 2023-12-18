
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();

    //行をi列打って列をj列打った時に黒になる数がKかどうか全探索する
    for(int i=0;i<=N;i++){
      for(int j=0;j<=M;j++){
        //i行j列打つと、黒になる数は、i*N+j*M-i*j*2
        if(K==i*N+j*M-i*j*2){
          System.out.println("Yes");
          return;
        }
      }
    }
    //見つからなかったら終わり
    System.out.println("No");




  }

    


}
