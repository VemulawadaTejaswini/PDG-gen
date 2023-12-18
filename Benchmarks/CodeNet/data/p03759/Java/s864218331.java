import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public void main() {
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        println((a + c) == 2 * b ? "YES" : "NO");
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
