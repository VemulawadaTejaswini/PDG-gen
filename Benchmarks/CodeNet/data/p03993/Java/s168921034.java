import java.util.Scanner;

/**
 * Created on 16/09/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        int result = solve(N, a);

        System.out.println(result);
    }


    private static int solve(int N, int[] a) {
        int num = 0;

        for (int i=0; i<N; i++) {
            if(a[i] > (i+1) && a[a[i]-1] == i+1) {
                num++;
            }
        }

        return num;
    }
}
