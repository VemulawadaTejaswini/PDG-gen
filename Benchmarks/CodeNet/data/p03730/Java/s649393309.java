import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int i = 1;
        int sum = 0;
        
        while (true) {
            if ((a % 2 == 0 && c % 2  != 0) || (a % 2 != 0 && c % 2  == 0)) {
                System.out.println("NO");
                return;
            } else {
                sum += a * i;
            }
            if (sum % b == c) {
                System.out.println("YES");
                return;
            }
            i++;
        }
    }
}
