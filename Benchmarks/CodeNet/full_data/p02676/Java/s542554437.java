import java.util.*;
// 7
// nikoandsolstice
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       String s = sc.next();
       String f = "";
       int length = s.length();
       for(int i = 0;i<t&& i<s.length();i++){
          f+= s.charAt(i); 
        
       }
       System.out.println(f+"...");
        
    }
}