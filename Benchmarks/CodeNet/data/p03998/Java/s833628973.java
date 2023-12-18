import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   char[] a = sc.next().toCharArray();
   char[] b = sc.next().toCharArray();
   char[] c = sc.next().toCharArray();
   
   int an = a.length;
   int bn = b.length;
   int cn = c.length;
   
   int acount=0;
   int bcount=0;
   int ccount=0;
 
   char tmp = 'a';
   char ans = 'A';
   for(int i=0;i<=an+bn+cn;i++) 
   {
     if(i==0)
     {
       tmp = a[acount];
       acount++;
     }
     else
     {
       if(tmp=='a')
       {
         if(acount==an)
         {
           ans='A';
           break;
         }
         else
         {
         tmp = a[acount];
         acount++;
         }
       }
       else if(tmp =='b')
       {
         if(bcount==bn)
         {
           ans='B';
           break;
         }
         else
         {
         tmp = b[bcount];
         bcount++;
         }
       }
       else
       {
         if(ccount==cn)
         {
           ans='C';
           break;
         }
         else
         {
         tmp = c[ccount];
         ccount++;
         }
       }
     }
   }
   System.out.println(ans);
 }
}