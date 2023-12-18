import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[3*N];
        for(int i = 0; i < 3*N; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        long ans = 0;
        for(int i = N; i < 3 * N - 1; i += 2){
            ans += a[i];
        }

        System.out.println(ans);
    }
}
