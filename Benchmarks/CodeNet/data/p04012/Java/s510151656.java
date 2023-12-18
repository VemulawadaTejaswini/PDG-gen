import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String w = scan.next();
        char[] ws = w.toCharArray();

        for (char i = 'a'; i <= 'z'; i++) {
            int count = 0;
            for (int j = 0; j < ws.length; j++) {
                if (ws[j] == i) count++;
            }

            if (count % 2 != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        
    }
}
