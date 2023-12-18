import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
 
public class Main {
    static int N;
    static int[] S;
    static int X;
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        X = Integer.parseInt(s[1]);
        S = new int[N];
        s = stdR.readLine().split(" ");
        long sum = 0;
        for(int i = 0 ; i < N; i++) {
            S[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(S);
        Queue<String> q = new LinkedList<String>();
        q.add(X+","+0);//index,res,count
        while(!q.isEmpty()) {
            String[] tmp = q.poll().split(",");
            int res = Integer.parseInt(tmp[0]);
            int tmpc = Integer.parseInt(tmp[1]);
            for(int j = N - 1 ; j >= 0 ; j--) {
                if(res < S[0]) {
                    sum += parsing(N - tmpc, res) % 1000000007;
                    break;
                }else if(S[j] <= res) {
                    q.add((res % S[j])+","+(tmpc+1));
                }
            }
        }
        System.out.println(sum % 1000000007);
    }
    
    public static long parsing(int N, long num) {
        long number = 1;
        for(int i = 2 ; i <= N ;i++) {
            number *= i;
            number %= 1000000007;
        }
        return (number * num) % 1000000007;
    }
}