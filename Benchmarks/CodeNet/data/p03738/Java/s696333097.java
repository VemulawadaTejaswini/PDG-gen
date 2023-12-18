import java.util.Scanner;

public class Main {
    public void main() {
        Scanner sc = new Scanner(System.in);

        String a = String.format("%101s", sc.nextLine());
        String b = String.format("%101s", sc.nextLine());

        int res = a.compareTo(b);

        if (res == 0) {
            println("EQUAL");
        } else if (res > 0) {
            println("GREATER");
        } else {
            println("LESS");
        }

        sc.close();
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
