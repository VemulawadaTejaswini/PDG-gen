import java.util.Scanner;
 
public class Main {
  public static void main (String[] args){
  
   int N,reverse=0,remaind,tmp;
    
   int a,b,c,d;
   int L,R;  

   Scanner sc = new Scanner (System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   d=sc.nextInt();
   
   L=a+b;
   R=c+d;

   if(L>R){
     System.out.println("Left");
   }
   else if(R>L){
     System.out.println("Right");
   }
   else if(L==R){
     System.out.println("Balanced");
   }
  }
}