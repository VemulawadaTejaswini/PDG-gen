import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n + 1];
        int[] Aa = new int[n];
        long result = 0;
        for(int i = 0; i < n; i++) {
            Aa[i] = Integer.parseInt(sc.next());
            A[Aa[i]]++;
        }
        for(int i = 0; i < n + 1; i++) {
            result += A[i] * (A[i] - 1) / 2;
        }
        for(int i = 0; i < n; i++) {
            System.out.println(result - (A[Aa[i]] > 1 ? A[Aa[i]] - 1 : 0));
        }
    }
}