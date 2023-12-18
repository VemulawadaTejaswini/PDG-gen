import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        // aC2
        long c = (a * (a-1)) /kaijo(a);
        long d = (b * (b-1)) /kaijo(b);
        System.out.println(c + d);
    }

    static long kaijo(long n){
        if(n == 0){
            return 1;
        }
        return n * kaijo(n-1);
    }
}