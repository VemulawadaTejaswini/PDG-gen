import java.util.*;
import java.lang.*;
import java.io.*;

public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
       int b= in.nextInt();
       int c= in.nextInt();
       int k= in.nextInt();
      
       while(a>b && k>0) {
          b=b*2;
         k--;
       }
      
       if(k>0 && b>c){
         c= c*2*k;
       }
      
       if(a<b && b<c){
          System.out.println("YES");
       } else 
         System.out.println("NO");

    }
}
