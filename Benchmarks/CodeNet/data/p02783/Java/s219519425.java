import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        double a = sc.nextLong();

        System.out.println((int)Math.ceil(h/a));

    }
}