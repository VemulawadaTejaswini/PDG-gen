import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b =new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int end = n / 2;
        if (n % 2 == 0) {
            end--;
        }
        int Bcount = 1;
        for (int i = 0; i < end; i++) {
            int j = a.length - i - 1;
            b[Bcount++] = a[j];
            b[Bcount++] = a[i];
        }

        if (n % 2 == 0) {
            b[0] = a[n/2];
            b[Bcount] = a[n/2+1];
        } else {
            if (Math.abs(b[1] - a[n/2+1]) > Math.abs(a[n/2+1] - b[Bcount - 1])) {
                b[0] = a[n/2+1];
            } else {
                b[Bcount] = a[n/2+1];
                b[0] = b[1];
            }
        }

        int sumDiff = 0;
        for (int i = 0; i < n - 1; i++) {
            sumDiff += Math.abs(b[i+1]) - Math.abs(b[i]);
        }

        System.out.println(sumDiff);
    }
}