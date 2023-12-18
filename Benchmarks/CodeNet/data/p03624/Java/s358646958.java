import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   char[] A = sc.next().toCharArray();   
   char[] alp = {'a','b','c','d','e','f','g','h','i',
                 'j','k','l','m','n','o','p','q','r',
                 's','t','u','v','w','x','y','z'};
   boolean flg = false;
 
   for(int i= 0;i<26;i++)
   {
     if(!A.contains(alp[i]))
     {
       System.out.println(alp[i]);
       break;
     }
   }
 
   if(flg) System.out.println("None");
 }
}