import java.util.*;
 public class Main{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int h=sc.nextInt();
     int w=sc.nextInt();
     int n=sc.nextInt();
     int rr=sc.nextInt();
     int cc=sc.nextInt();
     String s=sc.next();
     String t=sc.next();
     char[] a=s.toCharArray(); 
     char[] b=t.toCharArray(); 
     for(int i=0;i<n;++i){
       if(a[i]=='L') cc--;
       if(a[i]=='R') cc++;
       if(a[i]=='U') rr--;
       if(a[i]=='D') rr++;
       if(cc<=0 || rr<=0 || cc>w || rr>h){
         System.out.print("NO");
         return;
       }
       if(b[i]=='L') cc--;
       if(b[i]=='R') cc++;
       if(b[i]=='U') rr--;
       if(b[i]=='D') rr++;
       if(cc<=0 || rr<=0 || cc>w || rr>h){
         System.out.print("NO");
         return;
       }
     }
     System.out.print("YES");
   }
 }
