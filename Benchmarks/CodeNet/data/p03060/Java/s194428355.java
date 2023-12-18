import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int[] v = new int[N];
        for (int i=0; i<N; i++) {
            v[i] = sc.nextInt();
        }

        int[] c = new int[N];
        for (int i=0; i<N; i++) {
            c[i] = sc.nextInt();
        }

        int[] sa = new int[N];
        for (int i=0; i<N; i++) {
            sa[i] = v[i] - c[i];
        }

        int total = 0;
        for (int i=0; i<N; i++) {
            if (sa[i] >= 0) {
                total += sa[i];
            }
        }

        System.out.println(total);
    }
}