import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        String str = scanner.next();
        int len = str.length();
        System.out.println(str.charAt(0) + (len - 2) + str.charAt(len - 1));
    }
}
