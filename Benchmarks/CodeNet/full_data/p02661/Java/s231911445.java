import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n], B = new int[n];
        int[][] sA = new int[n][2], sB = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            sA[i][0] = A[i]; sA[i][1] = i;
            sB[i][0] = B[i]; sB[i][1] = i;
        }
        Arrays.sort(sA, (x,y) -> x[0] - y[0]);
        Arrays.sort(sB, (x,y) -> y[0] - x[0]);
        int ans = 0;
        int minMin = sA[(n-1) / 2][0];
        int maxMax = sB[(n-1) / 2][0];
        if(n % 2 == 1){
            ans = maxMax - minMin +1;
        }else{
            int minMax = 0;
            int maxMin = Integer.MAX_VALUE;
            for (int i = 0; i <= (n-1)/2; i++) {
                if(minMax < B[sA[i][1]]) minMax = B[sA[i][1]];
                if(A[sB[i][1]] < maxMin) maxMin = A[sB[i][1]];
            }
            minMax = Math.min(minMax, maxMax);
            maxMin = Math.max(maxMin, minMin);
            ans = minMax - minMin + maxMax - maxMin + 1;
        }
        System.out.println(ans);
        sc.close();

    }

}
