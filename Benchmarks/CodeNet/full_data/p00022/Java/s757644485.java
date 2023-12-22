import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Main m = new Main();
        m.run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);

        for(;;){
            int n = sc.nextInt();
            if(n == 0) break;

            int[] seq = new int[n];
            for(int i = 0; i < n ;i++){
                seq[i] = sc.nextInt();
            }

            long ans = solve(seq);
            System.out.println(ans);
        }
    }

    long solve(int[] seq){
        int n = seq.length;
        long ans = -Long.MAX_VALUE;

        long[] sum =  new long[n+1];

        for(int i = 0; i< n; i++){
            sum[i+1] = sum[i] + seq[i];
        }

        for(int start = 0; start < n; start++){
            for(int end = start+1; end < n+1 ; end++){
                ans = Math.max(ans, sum[end] - sum[start]);
            }
        }
        return ans;
    }
}