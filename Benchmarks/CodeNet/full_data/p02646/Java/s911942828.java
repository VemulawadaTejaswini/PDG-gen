import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = nextInt(scanner);
        long v = nextInt(scanner);
        long b = nextInt(scanner);
        long w = nextInt(scanner);
        long t = nextInt(scanner);
        long d = Math.abs(a - b);
        if (d - (v * t) + (w * t) > 0) {
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }

    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }


}



