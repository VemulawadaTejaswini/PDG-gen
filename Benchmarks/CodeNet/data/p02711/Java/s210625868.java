import java.util.Scanner;

public class Main {
    private static final char SEVEN = '7';
    
    private static final String YES = "Yes";
    
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next().trim();
        boolean lucky = false;
        
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == SEVEN) {
                lucky = true;
            }
        }
        
        if (lucky) {
            System.out.println(YES);
        } else {
            System.out.println(NO);
        }
    }
}