import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   String s = sc.next();
   int k = sc.nextInt();
   
   if(s.length()<=k){
   	System.out.println(s);
   }
   else if(s.length()>k){
   	System.out.println(s.substring(0,k)+"...");
   }
 
 }
}
