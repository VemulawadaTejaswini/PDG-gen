import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < k ; i++) {
            int d = sc.nextInt();
            for (int j = 0 ; j < d ; j++) {
                int g = sc.nextInt();
                a[g - 1]++;
            }
        }
        int c = 0;
        for (int i = 0 ; i < n ; i++) {
            if (a[i] == 0) c++;
        }
        System.out.println(c);
    }

}