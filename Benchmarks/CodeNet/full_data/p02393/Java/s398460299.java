import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int[] array = { a, b, c };

        for (int i : array) {
            if (i < 0 || i > 10000) {
                System.exit(0);
            }
        }

        if (array[0] > array[1]) {
            array[0] = b;
            array[1] = a;
        }

        if (array[1] > array[2]) {
            array[2] = a;
            array[1] = c;
        }

        if (array[0] > array[1]) {
            array[0] = b;
            array[1] = c;
        }

        print(array[0], array[1], array[2]);

        scan.close();
    }

    public static void print(int one, int tow, int three) {
        System.out.printf("%d %d %d", one, tow, three);
    }

}

