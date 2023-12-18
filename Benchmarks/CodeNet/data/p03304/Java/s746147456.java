import java.util.Scanner;

public class Main {
    final boolean DEBUG = true;

    void run() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int w = scan.nextInt();
        for (int i = 0; i < s.length(); i += w)
            System.out.print(s.charAt(i));
        System.out.println();
    }

    void runC() {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextInt();
        double m = scan.nextInt();
        double d = scan.nextInt();
        
        if (d == 0)
            System.out.printf("%.10f\n", (m - 1) / n);
        else
            System.out.printf("%.10f\n", (2 * (m - 1) * (n - d)) / (n * n));
    }

    public static void main(String[] args) {
        new Main().runC();
    }
}
