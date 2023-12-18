
import java.util.*;

class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String b = in.next();
        if (s.length() == b.length() && s.length() >= 1 && s.length() <= 100) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i)+""+b.charAt(i));
            }
        }
    }
}
