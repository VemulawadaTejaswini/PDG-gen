import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder str = new StringBuilder();
        while (scanner.hasNext()) {
            String s = scanner.next();
            if (s.charAt(s.length()-1) == '.') {
                str.append(s.toUpperCase());
            } else {
                str.append(scanner.next().toUpperCase());
                str.append(" ");
            }
        }
        
    }
}