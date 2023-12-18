import java.util.*;
import static java.lang.System.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   if(a == 1 && b ==1){
   	out.println("Draw");
   } else if(a == 1){
     out.println("Alice");
   } else if(b == 1){
     out.println("Bob");
   } else {
     if(a < b){
     	out.println("Bob");
     } else if(a > b){
       out.println("Alice");
     } else{
       out.println("Draw");
     }
   }
 }
  
}