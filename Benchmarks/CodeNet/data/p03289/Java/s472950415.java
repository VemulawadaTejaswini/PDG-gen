import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String S = sc.next();

   boolean flg = false;
   int count = 0;
   if(S.charAt(0)!='A') flg = true;
   if(S.charAt(1)=='C') flg = true;
   if(S.charAt(S.length()-1)=='C') flg = true;
   for(int i = 1;i<S.length();i++)
   {
     if(flg) break;
     if(S.charAt(i)=='C') count++;
     else if(Character.isUpperCase(S.charAt(i)))
     {
       flg = true;
     }
   }

   if(count>=2 || count == 0) flg = true;
   
   if(flg) System.out.println("WA");
   else System.out.println("AC");
 }
}