import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //        Scanner sc = new Scanner(System.in);
        //        int n = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        int[] result = new int[n];
        String[] lines = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(lines[i]);
        }
        countingSort(list, result, n);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    static void countingSort(int[] a, int[] b, int n) {
        int k = 10001;
        int[] c = new int[k];
        for (int i = 0; i < n; i++) {
            c[a[i]]++;
        }
        for (int i = 1; i < k; i++) {
            c[i] += c[i - 1];
        }
        for (int i = 0; i < n; i++) {
            c[a[i]]--;
            b[c[a[i]]] = a[i];
        }

    }
}