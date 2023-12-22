import java.util.Scanner;

public class Main {
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        cnt = 0;
        int m = 1 + (int) (Math.log(n) * Math.log(2));
        int[] G = new int[m];
        G[0] = 1;
        for (int i = 1; i < m; i++) {
            G[i] = G[i - 1] + (i+ i+1 + i+2);
        }

        // G[i]のセット

        for (int i = 0; i < m; i++) {
            insertionSort(a, G[i]);
        }

        println("");
        println(m + "");
        for (int i = m-1; i > 0; i--) {
            print(G[i] + " ");
        }
        println(G[0] + "");
        println(cnt + "");

        for (int i = 0; i < n; i++) {
            println(a[i] + "");
        }
    }

    static void insertionSort(int[] a, int g) {
        int len = a.length;

        for (int i = g; i < len; i++) {
            int temp = a[i];
            int j = i - g;
            while (j >= 0 && a[j] > temp) {
                a[j + g] = a[j];
                j -= g;
                cnt++;
            }
            a[j + g] = temp;
        }
//        printlnArray(a);
    }

    static void println(String str) {
        System.out.println(str);
    }

    static void print(String str) {
        System.out.print(str);
    }

//    private static void printlnArray(int[] a) {
//        for (int i = 0; i < a.length - 1; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println(a[a.length - 1]);
//    }
}
