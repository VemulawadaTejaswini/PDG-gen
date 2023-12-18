import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p[] = new int[N];

        for (int i=0;i<N;i++) {
            p[i] = sc.nextInt();
        }

        if (isAsc(p)) {
            System.out.println("YES");
            return;
        }

        for (int i=0;i<N-1;i++) {
            for (int j = i + 1; j < N; j++) {
                int tmp = p[i];
                p[i] = p[j];
                p[j] = tmp;
                if (isAsc(p)) {
                    System.out.println("YES");
                    return;
                }
                p[j] = p[i];
                p[i] = tmp;
            }
        }
        System.out.println("NO");
    }

    public static boolean isAsc(int a[]) {
        for (int i =0;i<a.length-1;i++) {
            if (a[i] > a[i+1]) return false;
        }
        return true;
    }
}
