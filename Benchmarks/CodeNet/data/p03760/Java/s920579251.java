import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   char[] a = sc.next().toCharArray();
   char[] b = sc.next().toCharArray();
 
   StringBuilder ans = new StringBuilder();
   
   for(int i=0;i<b.length;i++) 
   {
     ans.append(a[i]);
     ans.append(b[i]);
   }
   if(a.length!=b.length) ans.append(a[a.length-1]);
   System.out.println(ans.toString());
 }
}