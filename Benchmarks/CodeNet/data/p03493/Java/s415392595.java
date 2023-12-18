import java.util.Scanner;
 
class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int count = 0;
   
   String x = sc.next();
   
   // 1文字ずつ判定
   for(int i=0; i<3; i++){
   
    // 1のカウント
    if("1".equals(x[i])){
      count++;
    }
   }
   
   // 1のカウントを出力
   System.out.println(count);
 }
}