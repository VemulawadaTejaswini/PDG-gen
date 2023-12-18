import java.util.*;
import java.math.*;


public class Main {

public static void main(String[] args) {

   Scanner in = new Scanner(System.in);

   int N = in.nextInt();
   int A = 0;// 4で割り切れる数
   int B = 0;// 2で割り切れる数
   int C = 0;// 1
   int D = 0;// 上記以外

   for(int cnt = 0; cnt < N; cnt++){
       int num = in.nextInt();
       if(num % 4 == 0){
           A++;
       }
       else if(num % 2 == 0){
           B++;
           if(B % 2 == 0){
               B = B - 2;
               A++;
           }
       }
       else{
           C++;
       }
   }
   //2nが偶数個
   if(A >= N / 2){
       System.out.println("Yes");
   }
   else{
       System.out.println("No");
   }
   in.close();
}}