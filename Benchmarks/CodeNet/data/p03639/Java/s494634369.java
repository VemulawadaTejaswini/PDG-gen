import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int two = 0;
        int four = 0;
        int twoNotFour = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                two++;
            }
            if (num % 4 == 0) {
                four++;
            }
            if (num % 2 == 0 && num % 4 != 0) {
                twoNotFour++;
            }
        }
        
        boolean ok = false;
        if (two == n) {
            ok = true;
        } else if (four >= n / 2) {
            ok = true;
        } else if (n - (four * 2) <= two) {
            ok = true;
        }
        
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}