import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     long  N = sc.nextLong();
     long ans=0,test=1;
     if(N%2==0){
       while(N>test){
         test*=10;
         ans+=N/test;
       }
     }else{
       ans=0;
     }
     System.out.println(ans);
   }
}
