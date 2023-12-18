import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = 100;
        long i = 0;
        while (true) {
            i++;
            n *= 1.01;
            if (n >= x) {
                System.out.println(i);
                return;
            }
        }
    }

}
