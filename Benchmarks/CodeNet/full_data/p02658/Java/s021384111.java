import java.util.*;

public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   long ans = 1;
   long[] array = new long[n];
   boolean flag = false;

   for(int i=0; i<n; i++){
     long num = sc.nextLong();
     ans *= num;
     if(ans<0||ans>1000000000000000000L){
       flag = true;
     }
     if(num==0){
       flag = false;
     }
   }

   if(flag){
     System.out.println("-1");
   }else{
     System.out.println(ans);
   }

  }
}