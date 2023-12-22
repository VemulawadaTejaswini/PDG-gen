import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   int c=kbd.nextInt();
   int k=kbd.nextInt();
   long A=0;//合計
   int M=0;//枚数
   int K=0;//回数
   while(M<k&&K<a){
    A++;
    M++;
    K++;
   }
   K=0;//回数
   while(M<k&&K<b){
    M++;
    K++;
   }
   K=0;//回数
   while(M<k){
    A--;
    M++;
    K++;
   }
   System.out.println(A);
 }
}