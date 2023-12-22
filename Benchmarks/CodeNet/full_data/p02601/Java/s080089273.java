import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        boolean can = false;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - i; j++) {
                for (int l = 0; l < k - j - i; l++) {
                    int aa = (int) Math.pow(a, i);
                    int bb = (int) Math.pow(b, j);
                    int cc = (int) Math.pow(c, l);
                    if (aa < bb && bb < cc) {
                        can = true;
                        break;
                    }
                }
            }
        }
        if (can) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
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
