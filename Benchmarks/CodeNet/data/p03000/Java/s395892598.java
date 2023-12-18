import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        int L[] = new int[N];
        for(int i=0; i<N; i++) {
            L[i] = sc.nextInt();
        }
        int D =0;
        int cnt = 0;
        int idx = 0;
        while(D<=X) {
            D = D + L[idx];
            idx++;
            cnt++;
        }
        System.out.println(cnt);
    }
}