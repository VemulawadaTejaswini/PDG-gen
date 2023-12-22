import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = ip(br.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = ip(br.readLine());
        }
        shellSort(list, n);
        for(int i:list){
            System.out.println(i);
        }

    }

    static int insertionSort(int[] a, int n, int g) {
        int count = 0;
        for (int i = g; i < n; i++) {
            int v = a[i];
            int j = i - g;
            while (j >= 0 && a[j] > v) {
                a[j + g] = a[j];
                j -= g;
                count++;
            }
            a[j + g] = v;
        }
        return count;
    }

    static void shellSort(int[] a, int n) {
        int count = 0;
        int h = 0;
        int m=0;
        while (h <= n / 9) {
            h = 3 * h + 1;
            m++;
        }
        System.out.println(m);
        String[] g = new String[m];
        int c = 0;
        for (; h > 0; h /= 3) {
            g[c++] = String.valueOf(h);
            count += insertionSort(a, n, h);
        }
        System.out.println(String.join(" ", g));
        System.out.println(count);

    }

    private static void print(int[] list) {
        int n = list.length;
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(list[i]);
        }
        System.out.println(String.join(" ", str));
    }

    static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    static int[] createListInt(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static long[] createListLong(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        long[] list = new long[n];
        while (n-- > 0) {
            list[n] = Long.parseLong(lines[n]);
        }
        return list;
    }

    static int ip(String s) {
        return Integer.parseInt(s);
    }

    static long lp(String s) {
        return Long.parseLong(s);
    }
}