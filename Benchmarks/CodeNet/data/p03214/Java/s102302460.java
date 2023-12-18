import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] a = new long[N];
        for (int i=0; i<N; i++) {
            a[i] = scan.nextInt();
        }

        long sum = 0;
        for (int i=0; i<N; i++) {
            sum += a[i];
        }
        long avarage = sum/N;

        for (int i=0; i<N; i++) {
            a[i] = Math.abs(a[i] - avarage);
        }

        long min = 999999;
        int ans = 0;
        for (int i=0; i<N; i++) {
            if (a[i] < min) {
                min = a[i];
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
