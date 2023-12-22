import java.util.*;
class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
   long n = sc.nextLong();
   long t = n%10;
   if(t==3)
     System.out.println("bon");
   else if(t==0 || t==1|| t==6||t==8)
     System.out.println("pon");
   else
     System.out.println("hon");
   
 }
}