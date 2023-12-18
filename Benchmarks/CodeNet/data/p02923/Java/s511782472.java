import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int H[] = new int[N];
        for (int i=0; i<N; i++) {
            H[i] =  Integer.parseInt(sc.next());
        }
        sc.close();

        Integer C[] = new Integer[N];

        for (int i=0; i<N-1; i++) {
            if (H[i]>=H[i+1]) {
                C[i] = 1;
            } else {
                C[i] = 0;
            }
        }

        int max = 0;
        int cnt = 0;
        for (int i=0; i<N-1; i++) {
            if (C[i]==1) {
                cnt++;
                if (max < cnt)
                    max = cnt;
            } else {
                cnt = 0;
            }
        }
        
        System.out.println(max);
    }
}