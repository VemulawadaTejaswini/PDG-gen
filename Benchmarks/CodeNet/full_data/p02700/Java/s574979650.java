import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean takahashiWin;
        while (true) {
            c = c - b;
            if (c <= 0) {
                takahashiWin = true;
                break;
            }
            a = a - d;
            if (a <= 0) {
                takahashiWin = false;
                break;
            }
        }
        if (takahashiWin) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
