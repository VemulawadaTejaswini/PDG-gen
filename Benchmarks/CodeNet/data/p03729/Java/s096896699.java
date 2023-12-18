import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        
        String result = "NO";
        if (a.charAt(a.length()-1) == b.charAt(0) && b.charAt(b.length()-1) == c.charAt(0)) result ="YES";
        
        System.out.println(result);
      
    }
}
