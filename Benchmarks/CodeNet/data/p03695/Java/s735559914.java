import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] r = new int[9];
        for (int i = 0; i < n; i++) {
            if (a[i] < 400) {
                r[0]++;
            } else if (a[i] < 800) {
                r[1]++;
            } else if (a[i] < 1200) {
                r[2]++;
            } else if (a[i] < 1600) {
                r[3]++;
            } else if (a[i] < 2000) {
                r[4]++;
            } else if (a[i] < 2400) {
                r[5]++;
            } else if (a[i] < 2800) {
                r[6]++;
            } else if (a[i] < 3200) {
                r[7]++;
            } else {
                r[8]++;
            }
        }

        int count = 0;
        for (int i = 0 ; i < 8 ; i++) {
            if (r[i] > 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.print(1);
        } else {
            System.out.print(count);
        }
        System.out.print(" ");
        System.out.println(count + r[8]);
    }

}