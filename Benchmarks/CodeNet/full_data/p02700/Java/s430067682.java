import java.util.Scanner; 

class Main{

 public static void main(String[] args){

 Scanner scan = new Scanner(System.in);

 int A = scan.nextInt();
 int B = scan.nextInt();
 int C = scan.nextInt();
 int D = scan.nextInt();
   
 while (C>0 && A>0){
   C = C-B;
     if (C<=0){
       System.out.println("Yes");
     }
     else{
      A = A-D;
       if (A<=0){
         System.out.println("No");
       }
     }
   }
 }
}