import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                a++;
            else
                b++;
        }

        if (a > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}