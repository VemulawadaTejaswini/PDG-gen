import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   char[] a = sc.next().toCharArray();
   char[] alp = {'a','b','c','d','e','f','g','h','i',
                 'j','k','l','m','n','o','p','q','r',
                 's','t','u','v','w','x','y','z'};
   
   boolean flg = false;
   int tmp = 0;
   for(int i=0;i<26;i++) 
   {
     for(int k=0;k<a.length;k++)
     {
       if(a[k]==alp[i])
       {
         break;
       }
       
       if(k==a.length-1&&a[k]!=alp[i]) flg = true;
     }
     if(flg)
     {
       tmp = i;
       break;
     }
   }
   if(flg) System.out.println(alp[tmp]);
   else System.out.println("None");
 }
}