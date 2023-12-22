import java.util.*;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double m = sc.nextDouble();
        int a = (int)(m * 100);
        System.out.println(n * a/100);
    }
}