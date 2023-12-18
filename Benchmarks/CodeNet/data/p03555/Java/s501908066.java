import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solve(a, b));
    }

    private static String solve(String a, String b) {
        return new StringBuilder(a).reverse().toString().equals(b) ? "YES" : "NO";
    }
}
