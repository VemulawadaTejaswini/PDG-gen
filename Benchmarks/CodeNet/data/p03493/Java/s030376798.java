import java.util.Scanner;
 
class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int count = 0;
   
   String str = sc.next();
   
   // 1文字ずつ判定
   for(int i=0; i<str.length(); i++){
   
    // 1のカウント
    if("1".equals(str.charAt(i))){
      count++;
    }
   }
   
   // 1のカウントを出力
   System.out.println(count);
 }
}