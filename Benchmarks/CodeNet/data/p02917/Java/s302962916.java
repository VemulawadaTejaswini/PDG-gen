import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[] B = new int[n-1];
        for(int i = 0; i < n-1; i++) B[i] = Integer.parseInt(sc.next());
        ans += B[0] + B[n - 2];
        for(int i = 1; i < n - 1; i++) ans += Math.min(B[i - 1], B[i]);
        System.out.println(ans);
    }
}
