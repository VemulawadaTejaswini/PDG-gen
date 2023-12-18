import java.util.Scanner;

public class Main {
  public static void main (String[] args){
  
   int N,reverse=0,remaind,tmp;
  
   Scanner sc = new Scanner (System.in);
   N=sc.nextInt();
   tmp=N;
   while(tmp!=0)
   {
     remaind = tmp%10; //一桁ずつ取り出す
     reverse = reverse *10 + remaind; //数値反転
     tmp/=10; //次の桁へシフト
   }
   if(reverse==N){
     System.out.println("Yes");
   }
   else{
     System.out.println("No");
   }
  }
}