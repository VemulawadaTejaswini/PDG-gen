import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] c = new int[n + 1];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            c[a[i]]++;
        }
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum += c[i] * (c[i] - 1) / 2;
        }

        for (int i = 0 ; i < n ; i++) {
            System.out.println(sum - (c[a[i]] - 1));
        }


    }

}
