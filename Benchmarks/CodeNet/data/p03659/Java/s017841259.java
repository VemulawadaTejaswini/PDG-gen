import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] an = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            an[i] = sc.nextInt();
            total += an[i];
        }

        int a = 0;
        int b = total;
        int min = 1000000000;
        for (int i = 0; i < n-1; i++) {
            a += an[i];
            b -= an[i];
            min = Math.min(min, Math.abs(a-b));
        }

        System.out.println(min);
    }

}