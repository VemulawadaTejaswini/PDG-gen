import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N+1];
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
        }

        int ans = 0;
        L[N] = 10000;
        Arrays.sort(L);
        for(int i = 0; i < N; i++){
            int upper = i;
            for(int j = i + 1; j < N; j++){
                while(L[upper] < L[i] + L[j]){
                    upper++;
                }
                ans += upper - 1 - j;
            }
        }

        System.out.println(ans);
    }
}