import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && b > c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a > b && c > b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b > a && c > a && b > c) {
            System.out.println(b + " " + c + " " + a);
        } else if (b > a && c > a && c > b) {
            System.out.println(c + " " + b + " " + a);
        } else if (b > a && a > c ) {
            System.out.println(b + " " + a + " " + c);
        } else if (a > b && c > b && c > a) {
            System.out.println(c + " " + a + " " + b);
        }

    }
}