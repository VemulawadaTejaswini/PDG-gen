import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }


        int sum = 0;
        for (int l = 0; l < n; l++) {
            sum = sum + p[l];
        }

        int max = p[0];
        for (int j = 0; j < p.length; j++) {
            if (max < p[j]) {
                max = p[j];
            }
        }

        System.out.println(sum - (max / 2));

    }
}








