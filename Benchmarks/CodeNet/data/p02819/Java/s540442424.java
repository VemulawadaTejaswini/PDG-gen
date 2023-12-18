import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int x = sc.nextInt();
     	for(int i=x;i<x+100002;i++){
         if(isprime(i)){
            System.out.println(i);
           	break;
        }
    }
 }public static boolean isprime(int num){
      boolean isp = true;
      for(int i=2;i<=Math.sqrt(num);i++){
        if (num%i == 0){
        isp = false;
        }
      }
      return isp;
    }
}