import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String first = s.substring(0,1);
        if (first.equals(s.substring(1,2))) {
            if (s.substring(2,3).equals(s.substring(3,4))&& !first.equals(s.substring(3,4))) {
                
                System.out.println("YES");
                return;
            }
            System.out.println("NO");
            return;
        }
        
        if (first.equals(s.substring(2,3))) {
            if (s.substring(1,2).equals(s.substring(3,4))&& !first.equals(s.substring(3,4))) {
                
                System.out.println("YES");
                return;
            }
            System.out.println("NO");
            return;
        }
        
        if (first.equals(s.substring(3,4))) {
            if (s.substring(1,2).equals(s.substring(2,3))&& !first.equals(s.substring(2,3))) {
                
                System.out.println("YES");
                return;
            }
            System.out.println("NO");
            return;
        }
        System.out.println("NO");
    }
}