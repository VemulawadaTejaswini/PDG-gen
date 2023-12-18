import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        if (y % 1000 != 0) System.out.println("-1 -1 -1");
        else {
            y/=1000;
            int tens = -1, fives = -1, ones = -1;
            boolean found = false;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    int a = 10*i + 5*j;
                    if (a >= 0 && a <= y && (i + j + y - a) == n){
                        tens = i; fives = j; ones = y - a;
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (found) System.out.println(tens + " " + fives + " " + ones);
            else System.out.println("-1 -1 -1");
        }
        
    }
}
