import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String s = sc.next();
        int firstA = s.indexOf('A');
        int lastZ = s.lastIndexOf('Z');
        System.out.println(lastZ - firstA + 1);
    }
}