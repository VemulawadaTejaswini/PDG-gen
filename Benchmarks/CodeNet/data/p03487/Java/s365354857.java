import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      int N = sc.nextInt();
      if(N==0){
         System.out.println(N);
         return;
      }

      int[] array = new int[N];
      for(int i=0; i<N;i++){
         array[i] = sc.nextInt();
      }
      
      Arrays.sort(array);

      int result = 0;
      int count = 0;
      int old = 0;
      //iをグローバルにする？
      for(int i=0;i<N;i++){
         int target = array[i];
         if(target>N){
            result += N-i + count;
            break;
         }
         
         if(old == target){
            count++;

         }else{
            if(old >count){
               result+= count;
            }else{
               result+= count-old;
            }
            old = target;
            count = 1;
         }
         //count と old に

      }
      if(!(old ==count)){
         result += count;
      }
      System.out.println(result);
      /**
       * 
       * 1から順に探索
       * まず前回と同じか見る。
       * 
       * 前回とおなじ
       *      カウント数の方が大きい
       *      カウント数 - ターゲット
       *      カウント数の方が小さい
       *       コンテニュー
       * 
       * 古数とちがう
       *    カウント数加算。
       * 
       *    2 3 
       * 
       * 終了時
       * ばらが残ってる
       * oldとcountが不一致の場合追加
       * 
       * 10回回転
       * 全部11とか
       * result = N-i +count;
       * 
       */

       
   }
}
