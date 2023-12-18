import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = N / 100;
        int x = Integer.parseInt(n + "" + n + "" + n);

        if (x < N) {
            n = n + 1;
            x = Integer.parseInt(n + "" + n + "" + n);
            System.out.println(x);
        } else {
            System.out.println(x);
        }
    }
}