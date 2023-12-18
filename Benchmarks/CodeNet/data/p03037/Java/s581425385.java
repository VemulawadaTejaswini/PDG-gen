import java.util.*;
import java.lang.Integer;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //LとRの範囲
      int N = sc.nextInt();
      //L,Rの組数
      int M = sc.nextInt();
      
      //Lの最大値格納
      int maxL = 0;
      //Rの最小値格納
      int minR = N;
      
      for(int i = 0; i < M; i++){
        //今回のLR格納
        int L = sc.nextInt();
        int R = sc.nextInt();
        //最大最小チェック
        if(maxL < L){
          maxL = L;
        }
        if(minR > R){
          minR = R;
        }
      }
      if( minR - maxL < 0){
        System.out.println(0);
      }
      else{
        System.out.println(minR-maxL+1);
      }
    }
}