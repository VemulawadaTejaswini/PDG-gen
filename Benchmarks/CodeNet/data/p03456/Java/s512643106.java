import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = sc.next(), s2 = sc.next();
        int n = Integer.parseInt(s1 + s2);
        for (int i = 1; i < n; i++) {
            if (i*i == n) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}