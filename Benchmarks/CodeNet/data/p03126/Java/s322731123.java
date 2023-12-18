import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;
        int[] survey = new int[m+1];

        for (int i = 0; i < n; i++) {
            int kinds = sc.nextInt();
            for (int j = 0; j < kinds; j++) {
                if (++survey[sc.nextInt()] == n) count++;
            }
        }
        System.out.println(count);
    }
}