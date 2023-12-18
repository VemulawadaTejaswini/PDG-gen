import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0 ; i < n ; i++) {
           p[i] = sc.nextInt();
        }
        int min = 1000000;
        int c = 0;
        for (int i = 0 ; i < n ; i++) {
            if (p[i] < min) {
                c++;
                min = p[i];
            }
        }

        System.out.println(c);
    }

}
