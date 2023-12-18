import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        
        if (n % 2 == 0) {
            String half = s.substring(0, n / 2);
            if (s.equals(half + half)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
                System.out.println("No");
        }
    }
}