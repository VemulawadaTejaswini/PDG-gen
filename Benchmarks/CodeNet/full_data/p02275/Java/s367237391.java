import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        countingSort(a, b, n, 10000);

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            if(i != 1) sb.append(" ");
            sb.append(b[i]);
        }
        System.out.println(sb);
 
        sc.close();
    }

    private static void countingSort(int[] a, int[] b, int n, int k) {
        int[] c = new int[k + 1];
        for(int i = 0; i <= k; i++) {
            c[i] = 0;
        }

        for(int j = 1; j <= n; j++) {
            c[a[j]]++;
        }

        for(int i = 1; i <= k; i++) {
            c[i] = c[i] + c[i - 1];
        }

        for(int j = n; j > 0; j--) {
            b[c[a[j]]] = a[j];
            c[a[j]]--;
        }
    }
}
