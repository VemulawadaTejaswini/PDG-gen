import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(proc(x));
    }

    public static String proc(int x) {
        int mod = x % 100;
        int c = x / 100;

        return Math.ceil(mod / 5d) <= c
            ? "1"
            : "0";
    }
}