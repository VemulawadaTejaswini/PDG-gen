import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long kai = x / 11;
        long amari = x % 11;
        if (amari == 0) {
            System.out.println(kai * 2);
        } else if (amari <= 6) {
            System.out.println(kai * 2 + 1);
        } else {
            System.out.println(kai * 2 + 2);
        }

    }
}