import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String x1 = s.substring(0,(n-1)/2);
        int y = (n+3)/2;
        y -= 1;
        String x2 = s.substring(y);
        if(!ispal(s)) System.out.println("No");
        else if(!ispal(x1)) System.out.println("No");
        else if(!ispal(x2)) System.out.println("No");
        else System.out.println("Yes");
        
     }
     public static boolean ispal(String s){
         int n = s.length();
         if(n==1) return true;
         for(int i=0;i<n/2;i++){
             if(s.charAt(i)!=s.charAt(n-i-1)) return false;
         }
         return true;
     }
}