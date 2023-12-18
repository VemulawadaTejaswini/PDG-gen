import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public void main() {
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        println(Math.max(b - (a + w), 0));
    }

    public void print(Object o) {
        System.out.print(o);
    }

    public void println(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        new Main().main();
    }
}
