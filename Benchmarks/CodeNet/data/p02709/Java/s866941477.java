import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<int[]> a = new ArrayList<>();
        for(int i=0; i<N; i++){
            int[] in = new int[2];
            in[0] = i;
            in[1] = scanner.nextInt();
            a.add(in);
        }
        Collections.sort(
            a,
            new Comparator<int[]>(){
                @Override
                public int compare(int[] obj1, int[] obj2){
                    return obj2[1] - obj1[1];
                }
            }
        );

        long[][] dp = new long[N+1][N+1];
        for(int i=0;i<N; i++){
            int pos = a.get(i)[0];
            int A = a.get(i)[1];
            for(int j=0; j<=i; j++){
                dp[j+1][i-j] = Math.max(dp[j+1][i-j], dp[j][i-j] + A * Math.abs(pos-j) );
                dp[j][i-j+1] = Math.max(dp[j][i-j+1], dp[j][i-j] + A * Math.abs(pos-(N-(i-j+1))));
            }
        }
        long res = 0;
        for(int i=0; i<=N; i++){
            res = Math.max(res, dp[i][N-i]);
        }
        System.out.println(res);
    }
}