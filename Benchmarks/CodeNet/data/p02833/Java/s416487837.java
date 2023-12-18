import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long A = sc.nextLong();
 
   long ans = 0;
   long tmp = A;
   long t10 = 10; 
   ans += A/10;
   long t50= 50;
      for(int i = 1;i<100;i++)
   {
     if(A%2==1) break;
     tmp=A/t50;
     ans+= tmp;
     t50*=5;
 
     if(tmp == 0) break; 
   }
   
   
   System.out.println(ans);
  
 }
}