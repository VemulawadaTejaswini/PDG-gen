import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int c = 0;
        String ans = "Yes";
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sc.next());
            sum += A[i];
        }
        Arrays.sort(A);
        int bd = (int)Math.floor(sum / (4 * m));
        for(int i = n-1; i >= 0 ; i--) {
            if(A[i] < bd) break;
            c++;
        }
        if(c < m) ans = "No";
        System.out.println(ans);
    }
}
