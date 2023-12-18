import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int tmp = v[0];
        for (int i = 1; i < n; i++) {
            if (tmp != v[i]) {
                break;
            } else {
                System.out.println(v.length / 2);
                System.exit(0);
            }
        }

        int c = 0;
        for (int i = 0; i < n-2; i++) {
            if (v[i] != v[i+2]) {
                c++;
            }
        }

        System.out.println(c);
    }
}