import java.util.Scanner;


class Main{
 public static void main(String[] args){
 Scanner stdIn = new Scanner(System.in);
 //数値の入力
 int K = stdIn.nextInt(); //倍数
 int A = stdIn.nextInt();
 int B = stdIn.nextInt();
 
 //計算
 int num = 0;
 
 for (int i = 0; i <= (B / K); i++){
   if( i * K >= A)
    num = num +1;
 }
 
 if(num > 0)
  System.out.println("OK");
 else
  System.out.println("NG");
 }
}
