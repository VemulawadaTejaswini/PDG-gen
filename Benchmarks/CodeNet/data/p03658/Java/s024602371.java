import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] ls = new int[N];

        for (int i=0; i<N; i++) {
            ls[i] = sc.nextInt();
        }
        Arrays.sort(ls);

        int sum = 0;
        for (int i=0; i<K; i++) {
            sum += ls[N-1-i];
        }
        System.out.println(sum);
    }
}

