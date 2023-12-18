import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   String b = sc.next();
   int c = sc.nextInt();
 
   if(b.equals("+"))System.out.println(a+c);
   else System.out.println(a-c);
 }
}