import java.util.Scanner;

public class C_GeTAC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        int l[] = new int[Q];
        int r[] = new int[Q];
        for (int i = 0; i < Q; i++) {
        	l[i] = sc.nextInt();
        	r[i] = sc.nextInt();
        }
        String[] arr = S.split("");

        int[] sum = new int[N+1];
        for (int i = 0; i < N+1; i++) {
        	sum[i] = 0;
        }

        // ACがでる可能性があるのは2文字目から
        for (int i = 1; i < N; i++) {
        	if (arr[i-1].equals("A") && arr[i].equals("C")) {
        		sum[i+1] = sum[i]+1;
        	} else {
        		sum[i+1] = sum[i];
        	}
        }

        for (int i = 0; i < Q; i++) {
        	int ans = sum[r[i]] - sum[l[i]];
        	System.out.println(ans);
        }
 	}
}
