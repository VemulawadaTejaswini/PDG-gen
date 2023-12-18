import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        long point = 0;

        for(int i = 0; i < n; i++) {
            if (i % 2 == 0) { // takahashi
                int j = Main.max(a, b);
                point += a[j];
                a[j] = 0;
                b[j] = 0;
            } else {
                int j = Main.max(b, a);
                point -= b[j];
                a[j] = 0;
                b[j] = 0;
            }
        }

        System.out.println(point);
    }
    
    static int max(int[] a, int[] b) {
        int max = a[0];
        int maxNum = 0;
        for (int j = 1; j < a.length; j++) {
            if (max < a[j]) {
                max = a[j];
                maxNum = j;
            } else if (max == a[j] && b[j] > b[maxNum]) {
                max = a[j];
                maxNum = j;
            }
        }
        return maxNum;
    }
}