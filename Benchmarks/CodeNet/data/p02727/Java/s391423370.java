import java.util.*;

/*
問題文


*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long A[] = new long[a];
        long B[] = new long[b];
        long C[] = new long[c];

        for (int i = 0; i < a; i ++) {
                A[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i ++) {
                B[i] = sc.nextInt();
        }
        for (int i = 0; i < c; i ++) {
                C[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        int ans = 0;
        int tempa = 1;
        int tempb = 1;
        int tempc = 1;
        for (int i = 0; i < x; i++) {
            if (A[a-tempa] > C[c-tempc]) {
                ans += A[a-tempa];
                tempa++;
            } else {
                ans += C[c-tempc];
                tempc++;
            }
        }
        for (int i = 0; i < x; i++) {
            if (B[b-tempb] > C[c-tempc]) {
                ans += B[b-tempb];
                tempb++;
            } else {
                ans += C[c-tempc];
                tempc++;
            }
        }

        System.out.println(ans);
    }
}