import java.util.*;
 
public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       long N = sc.nextLong(); //long型で宣言
       double root = Math.sqrt(N);
       long a = 1; //最初の地点
       long b = 1; //最初の地点
       long count = 0; //移動回数
       
       while(a < root){
           if(N%a == 0){ //aで割り切れる時
               b = N/a ;　//商をbとして設定
           }
           
       }
       
       