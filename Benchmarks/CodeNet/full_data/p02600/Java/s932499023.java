import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int out;
        if (399 < x && x < 600) {
            out = 8;
        }else if (x < 800) {
            out = 7;
        }else if (x < 1000) {
            out = 6;
        }else if (x < 1200) {
            out = 5;
        }else if (x < 1400) {
            out = 4;
        }else if (x < 1600) {
            out = 3;
        }else if (x < 1800) {
            out = 2;
        }else {
            out = 1;
        }
        System.out.println(out);
    }


    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

    private static long nextLong(Scanner scanner) {
        return Long.parseLong(scanner.next());
    }

    private static float nextFloat(Scanner scanner) {
        return Float.parseFloat(scanner.next());
    }

    private static double nextDouble(Scanner scanner) {
        return Double.parseDouble(scanner.next());
    }


}







