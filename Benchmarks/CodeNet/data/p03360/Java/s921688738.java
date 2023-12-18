import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            long a = Integer.parseInt(array[0]);
            long b = Integer.parseInt(array[1]);
            long c = Integer.parseInt(array[2]);
            int k = Integer.parseInt(scanner.nextLine());

            if (a > b && a > c) {
                for (int i = 0; i < k; ++i) {
                    a *= 2;
                }
            } else if (b > c) {
                for (int i = 0; i < k; ++i) {
                    b *= 2;
                }
            } else {
                for (int i = 0; i < k; ++i) {
                    c *= 2;
                }
            }
            System.out.println(a + b + c);
        }
    }
}