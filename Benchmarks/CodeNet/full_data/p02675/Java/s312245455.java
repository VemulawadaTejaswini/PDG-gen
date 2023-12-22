import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    static int readOneInt() {
        String line = SCANNER.nextLine();
        return Integer.parseInt(line);
    }

    public static void main(String[] args) {

//        int tc = Integer.parseInt(SCANNER.nextLine());
        int tc = 1;
        for (int i = 0; i < tc; ++i) {
            test(readOneInt());
        }
    }

    private static void test(int n) {
        int d = n % 10;
        if (d == 2 || d == 4 || d == 5 || d == 7 || d == 9) {
            System.out.println("hon");
        } else if (d == 0 || d == 1 || d == 6 || d == 8) {
            System.out.println("pon");
        } else if (d == 3) {
            System.out.println("bon");
        }
    }
}

