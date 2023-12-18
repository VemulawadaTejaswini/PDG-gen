import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());

        long max = (n-1)*n/2;
        sc.close();
        System.out.println(max);
    }
}