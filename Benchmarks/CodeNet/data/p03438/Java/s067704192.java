import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        long sumA = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            sumA += (long) a[i];
        }
        long sumB = 0;
        for (int i = 0 ; i < n ; i++) {
            b[i] = sc.nextInt();
            sumB += (long) b[i];
        }

        long dif = sumB - sumA;
        long count = 0;
        for (int i = 0 ; i < n ; i++) {
            if (a[i] > b[i]) {
                count += (long) (a[i] - b[i]);
            } else {
                count += Math.ceil( (double) (b[i] - a[i])/ 2);
            }
        }

        if (count <= dif) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

}