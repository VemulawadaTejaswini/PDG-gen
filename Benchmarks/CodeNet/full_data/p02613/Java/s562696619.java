import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = nextInt(scanner);
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
        for (int i = 0; i < n; i++) {
            switch (scanner.next()) {
                case "AC":
                    ac++;
                    break;
                case "WA":
                    wa++;
                    break;
                case "TLE":
                    tle++;
                    break;
                case "RE":
                    re++;
                    break;
            }
        }
        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
        System.out.println("TLE x " + tle);
        System.out.println("RE x " + re);
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



