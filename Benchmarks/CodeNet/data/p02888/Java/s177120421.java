import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < N; i++){
            if(i == N - 2) break;
            for(int j = i + 1; j < N; j++){
                if(j == N - 1) break;
                for(int k = j + 1; k < N; k++){
                    if(L[i] < L[j] + L[k] && L[j] < L[k] + L[i] && L[k] < L[i] + L[j]) ans++;
                }
            }
        }

        System.out.println(ans);
    }
}