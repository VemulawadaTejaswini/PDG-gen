import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int k = sc.nextInt();
   int a = sc.nextInt();
   int b = sc.nextInt();
   
   int c=b%k;
   int d=b-k;

   if(a<=d){
     System.out.println("OK");
   }else{
     System.out.println("NG");
   }
 
 }
}
