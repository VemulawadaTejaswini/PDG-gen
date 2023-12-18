import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a = x / 500;
        long b = (x - a * 500) / 5;
        System.out.println(a * 1000 + b * 5);
    }

}
