import java.util.Scanner;

/**
 * TITLE : Dice in Line
 * URL : https://atcoder.jp/contests/abc154/tasks/abc154_d
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] P = new int[N];
        Range r = new Range();
    	int sum = 0;
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
            sum += P[i];
            if (i > K-1) {
            	sum -= P[i-K];
            	if (sum > r.sum) {
            		r.sum = sum;
            		r.index = i-K+1;
            	}
            } else if (i == K-1) {
            	r.sum = sum;
            	r.index = 0;
            }

        }


        double answer = 0;
        for (int i = r.index; i < r.index + K; i++) {
        	sum = 0;
            for (int j = 1; j <= P[i]; j++) {
            	sum += j;
            }
            answer += (double)sum / P[i];
        }
        System.out.println(answer);
        sc.close();
    }

    private static class Range {
    	int sum = 0;
    	int index = 0;
    }
}