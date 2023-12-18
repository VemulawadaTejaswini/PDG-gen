import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String a = sc.next();
 
   if(a.equals("a")||a.equals("u")||a.equals("o")||a.equals("i")||a.equals("e"))System.out.println("vowel");
   else System.out.println("consonant");
 }
}