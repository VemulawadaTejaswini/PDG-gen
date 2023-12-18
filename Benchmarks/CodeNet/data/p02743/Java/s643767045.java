import java.util.*;
 
class Main{
 
 public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
   
   double a = sc.nextDouble();
   double b = sc.nextDouble();
   double c = sc.nextDouble();
   
  if((1 <= a && a <= Math.pow(10,9)) && (1 <= b && b <= Math.pow(10,9) ) && (1 <= c && c <= Math.pow(10,9))){
  if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)){
    System.out.println("Yes");
   }else{
    System.out.println("No");
   }
  }
 
 }
}
