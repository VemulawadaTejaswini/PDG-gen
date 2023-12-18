import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int l = 0;
        int r = N-1;
        long ans = 0;

        // 0: low-high
        // 1: low-low
        // 2: high-low
        // 3: high-high
        int st = 0;
        int al = A[l];
        int ar = A[r];
        ans += Math.abs(al-ar);
        l++;
        r--;
        while (l <= r) {
            if (st == 0) {
                // 0: low-high
                if (A[r]-al > ar-A[l]) {
                    ans += A[r]-al;
                    al = A[r--];
                    st = 3;
                } else {
                    ans += ar-A[l];
                    ar = A[l++];
                    st = 1;
                }
            } else if (st == 1) {
                // 1: low-low
                if (A[r]-al > A[r]-ar) {
                    ans += A[r]-al;
                    al = A[r--];
                    st = 2;
                } else {
                    ans += A[r]-ar;
                    ar = A[r--];
                    st = 0;
                }
            } else if (st == 2) {
                // 2: high-low
                if (al-A[l] > A[r]-ar) {
                    ans += al-A[l];
                    al = A[l++];
                    st = 1;
                } else {
                    ans += A[r]-ar;
                    ar = A[r--];
                    st = 3;
                }
            } else {
                // 3: high-high
                if (al-A[l] > ar-A[l]) {
                    ans += al-A[l];
                    al = A[l++];
                    st = 0;
                } else {
                    ans += ar-A[l];
                    ar = A[l++];
                    st = 2;
                }
            }
        }

        System.out.println(ans);
    }
}

