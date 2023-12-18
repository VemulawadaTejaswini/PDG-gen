import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] v = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (max < ((v[i] + v[j]) - (c[i] + c[j])) && i != j) {
                    max = ((v[i] + v[j]) - (c[i] + c[j]));
                }
            }
        }

        System.out.println(max);
    }
}