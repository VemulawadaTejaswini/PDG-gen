import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int ab = 0;
        int ac = 0;
        int bc = 0;
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            str[i] = s;
            if (s.equals("AB")) {
                ab++;
            } else if (s.equals("AC")) {
                ac++;
            } else {
                bc++;
            }
        }
        
        if (ab > 0) {
            if (a == 0 && b == 0) {
                System.out.println("No");
                return;
            }
        }
        if (ac > 0) {
            if (a == 0 && c == 0) {
                System.out.println("No");
                return;
            }
        }
        if (bc > 0) {
            if (b == 0 && c == 0) {
                System.out.println("No");
                return;
            }
        }
        
        if (a == b && b == c && c == 0) {
            System.out.println("No");
            return;
        }
        
        System.out.println("Yes");
        for (int i = 0; i < n; i++) {
            String s = str[i];
            if (s.equals("AB")) {
                if (a > b) {
                    System.out.println("B");
                    a--;
                    b++;
                } else {
                    System.out.println("A");
                    b--;
                    a++;
                }
            } else if (s.equals("AC")) {
                if (a > c) {
                    System.out.println("C");
                    a--;
                    c++;
                } else {
                    System.out.println("A");
                    c--;
                    a++;
                }
            } else {
                if (b > c) {
                    System.out.println("C");
                    c++;
                    b--;
                } else {
                    System.out.println("B");
                    b++;
                    c--;
                }
            }
        }
    }
}
