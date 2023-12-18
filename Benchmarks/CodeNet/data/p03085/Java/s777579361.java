import java.util.Scanner;
public class Helix{
 
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String b = sc.next();
   if(b == "A"){
   System.out.print("T");
   }else if(b == "T"){
   System.out.print("A");
   }else if(b == "C"){
   System.out.print("G");
   }else if(b == "G"){
   System.out.print("C");
   }else{
     System.out.print("Input Error");
   }
 }
}