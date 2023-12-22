import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String  t = sc.next();
     String s = sc.next();
     int ans=0;
     for(int i=0;i<s.length();i++){
       if(t.charAt(i)!=s.charAt(i)){
         ans++;
       }
     }
     System.out.println(ans);

   }
}
