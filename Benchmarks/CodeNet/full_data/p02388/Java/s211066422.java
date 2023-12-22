import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        XCubic.run();
    }
public class XCubic {
    static void run () {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x * x * x);
    }
}
}