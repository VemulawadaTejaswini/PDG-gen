import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int sumb = 0;
        int sumc = 0;

        /*
        if(K >= A) {
            sumb = K - A;
            if(sumb > 0) {
                sumc = K - A - B;
            }
            System.out.println(A - sumc);
        } else System.out.println(K);
        */

        //別解
        int xa = Math.min(A,K);
        K -= xa;
        int xb = Math.min(B,K);
        K -= xb;
        int xc = K;
        int ans = xa -xc;
        System.out.println(ans);

    }
}