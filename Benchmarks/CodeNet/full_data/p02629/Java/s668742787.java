import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = nextInt(scanner);
        String nn = Long.toString(n, 26);
        char[] c = nn.toCharArray();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case '1':
                    c[i] = 'a';
                    break;
                case '2':
                    c[i] = 'b';
                    break;
                case '3':
                    c[i] = 'c';
                    break;
                case '4':
                    c[i] = 'd';
                    break;
                case '5':
                    c[i] = 'e';
                    break;
                case '6':
                    c[i] = 'f';
                    break;
                case '7':
                    c[i] = 'g';
                    break;
                case '8':
                    c[i] = 'h';
                    break;
                case '9':
                    c[i] = 'i';
                    break;
                case 'a':
                    c[i] = 'j';
                    break;
                case 'b':
                    c[i] = 'k';
                    break;
                case 'c':
                    c[i] = 'l';
                    break;
                case 'd':
                    c[i] = 'm';
                    break;
                case 'e':
                    c[i] = 'n';
                    break;
                case 'f':
                    c[i] = 'o';
                    break;
                case 'g':
                    c[i] = 'p';
                    break;
                case 'h':
                    c[i] = 'q';
                    break;
                case 'i':
                    c[i] = 'r';
                    break;
                case 'j':
                    c[i] = 's';
                    break;
                case 'k':
                    c[i] = 't';
                    break;
                case 'l':
                    c[i] = 'u';
                    break;
                case 'm':
                    c[i] = 'v';
                    break;
                case 'n':
                    c[i] = 'w';
                    break;
                case 'o':
                    c[i] = 'x';
                    break;
                case 'p':
                    c[i] = 'y';
                    break;
                case 'q':
                    c[i] = 'z';
                    break;

            }
        }
        System.out.println(new String(c));

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
