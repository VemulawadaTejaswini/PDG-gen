import java.util.*;
 
class Main{
 
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   
   double a = sc.nextDouble();
   double b = sc.nextDouble();
   double c = sc.nextDouble();
   
  if((check(a) + check(b) < check(c))){
    System.out.println("Yes");
   }else{
    System.out.println("No");
   }
 }
  
 private static double check(double test){
   double testv = Math.sqrt(test); 
   if(testv*testv > test) {
     return testv - 1 ;
   }else{ return testv;}
 }



}
