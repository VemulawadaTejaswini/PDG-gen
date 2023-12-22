import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
    public static void count(String[] a_str, int[] a, int[] counts) {
        for(int i = 0; i < a_str.length; i++) {
            a[i] = Integer.parseInt(a_str[i]);
            counts[a[i]]++;
        }
    }

    public static void sum(int[] counts) {
        for(int i = 1; i < counts.length; i++) {
            counts[i] += counts[i-1];
        }
    }

    public static void sort(int[] a, int[] counts, int[] out) {
        for(int i = a.length - 1; i >= 0; i--) {
            int index = counts[a[i]] - 1;
            out[index] = a[i];
            counts[a[i]]--;
        }
    }

    public static void printArray(int[] a) {
        PrintWriter out = new PrintWriter(System.out);
        out.print(a[0]);
        for(int i = 1; i < a.length; i++) {
            out.print(" ");
            out.print(a[i]);
        }
        out.println();
        out.flush();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] A_str = br.readLine().split(" ");
        int[] A = new int[n];
        int[] counts = new int[10001];
        int[] sorted = new int[n];
 
        count(A_str, A, counts);
        sum(counts);
        sort(A, counts, sorted);
 
        printArray(sorted);
    }
}