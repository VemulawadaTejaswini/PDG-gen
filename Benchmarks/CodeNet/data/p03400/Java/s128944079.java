import java.util.Scanner;

// 22
public class Main {
    static int chocolate(int ai, int d) {
        int eated = 1;
        for(int i = 1; i <= d; i++) {
            if(d < i * ai + 1) break;
            ++eated;
        }

        return eated;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int count = 0;
        for(int i = 0; i < n; i++)
            count += chocolate(a[i], d);

        System.out.println(count + x);
    }

}
