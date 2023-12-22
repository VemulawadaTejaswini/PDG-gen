 import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x;
        int z = 0;
        for (x = a; x <= b; x++) {
            if (c % x == 0) {
                z++;
            }
        }
        System.out.println(z);

    }

}
