import java.util.Scanner;
 
class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner();
   int count = 0;
   
   // 1文字ずつint型で受け取る
   for(int i=0; i<3; i++){
   	int x = sc.nextInt();
    // 1のカウント
    if(x == 1){
      count++;
    }
   }
   
   // 1のカウントを出力
   System.out.println(count);
 }
}