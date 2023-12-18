import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        public static void main(String[] args){
          int N = getInt();
          long[] list = new long[N];
          long max = 0;
          for(int i = 0; i < N; i++){
            list[i] = getLong();
            max += list[i];
          }
          
          long output1 = 0;//左から
          long output2 = 0;//右から
          long[] test = new long[N];
          long[] test2 = new long[N];
          //累積和やってみる？
          //myout(test[0]);
          for(int i = 0; i < N; i++){
            if(i > 0){
            	test[i] = test[i-1] + list[i];
            }else{
                test[i] = list[i];
            }
            if(max / 2 <= test[i]){
              if(max / 2 == test[i]){
                //コスト0円のケース
			  	//累積和を求める過程で合計/2が見つかる場合
              	myout("0");
                return;
              }else{
                //半分超えたら、それまでの累積和と残り分の差(max-test[i])の絶対値だけお金要る
                output1 = Math.abs(test[i]-(max-test[i]));
                break;
              }
            }
          }
          
          for(int i = N-1; 0 <= i; i--){
            if(i != N-1){
            	test2[i] = test2[i+1] + list[i];
            }else{
                test2[i] = list[i];
            }
            if(max / 2 <= test2[i]){
              if(max / 2 == test2[i]){
                //コスト0円のケース
			  	//累積和を求める過程で合計/2が見つかる場合
              	myout("0");
                return;
              }else{
                //半分超えたら、それまでの累積和と残り分の差(max-test[i])の絶対値だけお金要る
                output2 = Math.abs(test2[i]-(max-test2[i]));
                break;
              }
            }
          }
          myout(Math.min(output1,output2));
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
