import java.util.Scanner;

class Main {

    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a == b) {
            System.out.println("a == b");
        } else if ( a < b ) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
    }
}

