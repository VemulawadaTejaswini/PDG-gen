import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        long num = Math.max(b / x, 0) - Math.max((a - 1) / x, 0);
        if (a == 0) num++; 
        System.out.println(num);
    }
}
