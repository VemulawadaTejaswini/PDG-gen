import java.util.Arrays;
import java.util.Scanner;

// 15
class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);
        int ans = a[N / 2] - a[N / 2 - 1];

        System.out.println(ans);
    }

}
