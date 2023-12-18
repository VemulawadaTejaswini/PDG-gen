import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        long sumA = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            sumA += a[i];
        }
        long sumB = 0;
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
            sumB += b[i];
        }

        long op = sumB - sumA;
        if (op < 0) {
            System.out.println("No");
            return;
        }

        long opA = 0;
        for (int i = 0 ; i < N; i++) {
            if (a[i] < b[i]) {
                int c = (b[i]-a[i]+1)/2;
                opA += c;
                a[i] += c*2;
            }
        }

        long opB = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] > b[i]) {
                opB += a[i]-b[i];
            }
        }

        System.out.println(opA <= op && opB <= op && (op-opA)*2 == op-opB
                           ? "Yes" : "No");
    }
}

