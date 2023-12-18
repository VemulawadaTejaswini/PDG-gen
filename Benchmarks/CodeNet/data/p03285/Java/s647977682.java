import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = false;
        if (n % 4 == 0) {
            result = true;
        }
        if (n % 7 == 0) {
            result = true;
        }
        if (n % 11 == 0) {
            result = true;
        }
        if (n % 15 == 0) {
            result = true;
        }
        if (n % 18 == 0) {
            result = true;
        }
        if (n % 19 == 0) {
            result = true;
        }
        if (n % 23 == 0) {
            result = true;
        }
        if (n % 26 == 0) {
            result = true;
        }
        if (n % 27 == 0) {
            result = true;
        }
        if (n % 29 == 0) {
            result = true;
        }
        if (n % 30 == 0) {
            result = true;
        }
        if (n % 39 == 0) {
            result = true;
        }
        if (n % 43 == 0) {
            result = true;
        }
        if (n % 59 == 0) {
            result = true;
        }
        if (n % 67 == 0) {
            result = true;
        }
        if (n % 71 == 0) {
            result = true;
        }
        if (n % 83 == 0) {
            result = true;
        }
        if (n % 97 == 0) {
            result = true;
        }
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}