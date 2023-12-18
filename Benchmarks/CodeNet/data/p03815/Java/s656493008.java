import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        System.out.println((long)Math.ceil((x / 11.0) * 2));
    }
}