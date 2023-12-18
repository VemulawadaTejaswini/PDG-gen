import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = n*a;

        if (m > n) {
            System.out.print(m);
        } else {
            System.out.print(n);
        }
    }
}