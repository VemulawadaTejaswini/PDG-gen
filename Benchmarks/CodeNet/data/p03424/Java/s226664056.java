import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();

   String[] a = new String[N];
   for(int i=0;i<N;i++) a[i] =sc.next();
   
   boolean four = false;
   for(int i=0;i<N;i++) 
   {
     if(a[i].equals("Y"))
     {
       four = true;
       break;
     }
   }
   if(four) System.out.println("Four");
   else System.out.println("Three");
 }
}