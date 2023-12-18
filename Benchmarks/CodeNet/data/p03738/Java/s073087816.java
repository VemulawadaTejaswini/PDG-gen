import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   String S = sc.next();
   String M = sc.next();
   
   if(S.equals(M)) System.out.println("EQUAL");
   else
   {
     String[] m ={S,M};
     Arrays.sort(m);
     
     if(S.equals(m[1])) System.out.println("GREATER");
     else System.out.println("LESS");
   }
 }
}