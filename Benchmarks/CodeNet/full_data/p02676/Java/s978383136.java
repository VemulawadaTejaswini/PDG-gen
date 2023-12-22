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
            int k = readOneInt();
            String s = SCANNER.nextLine();
            test(s, k);
        }
    }

    private static void test(String s, int k) {
        if (s.length() <= k) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(0, k) + "...");
        }

    }
}

