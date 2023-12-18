import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();;
        int c = sc.nextInt();

        for (int i = 0, x = a; i < 1000; i += 1, x += a) {
            if (x % b == c) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}