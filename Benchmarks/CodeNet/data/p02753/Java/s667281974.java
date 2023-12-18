import java.util.*;
import java.lang.*;

public class Main {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}