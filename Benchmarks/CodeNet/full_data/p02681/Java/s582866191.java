import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        String T = scanner.next();

        if(S.length() < 1 || 10 < S.length()) {
            System.out.println("No");
            return;
        }

        StringBuilder sb = new StringBuilder(T);
        
        sb.setLength(sb.length() - 1);

        if(S.equals(sb.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        

    }
}