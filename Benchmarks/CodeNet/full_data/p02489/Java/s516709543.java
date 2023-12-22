import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        for (int ii = 1; ; ii++) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            System.out.println("Case " + ii + ": " + a);
        }
    }
}