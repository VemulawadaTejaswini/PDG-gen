import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final String S = sc.next();
        final String T = sc.next();
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < S.length() - T.length() + 1; i++) {
            int diff = 0;
            
            for (int j = 0; j < T.length(); j++) {
                if (S.charAt(i + j) != T.charAt(j)) {
                    diff++;
                }
            }
            if (diff < min) {
                min = diff;
            }
        }
        System.out.println(min);
    }
}
