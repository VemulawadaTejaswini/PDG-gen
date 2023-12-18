import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        double sum = 0;

        for (int i = 0 ; i < n ; i++) {
            for (int j = i ; j < n ; j++) {
                sum += Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
            }
        }


        System.out.println((double) sum * 2 / n);
    }

}
