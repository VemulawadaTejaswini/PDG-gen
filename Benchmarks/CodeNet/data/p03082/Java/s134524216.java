import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);
        int[] S = new int[N];
        s = stdR.readLine().split(" ");
        for(int i = 0 ; i < N; i++) {
            S[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(S);
        long sum = 0;
        for(int i = N - 1 ; i >= 0 ; i--) {
            String[] tmp = result(S,i,X,0).split(",");
            sum += parsing(N - Integer.parseInt(tmp[1]), Long.parseLong(tmp[0]));
            sum %= 1000000007;
        }
        System.out.println(sum);
    }
    
    public static long parsing(int N, long num) {
        long number = 1;
        for(int i = 2 ; i <= N ;i++) {
            number *= i;
            number %= 1000000007;
        }
        return (number * num) % 1000000007;
    }
    
    public static String result(int[] S, int index, int res, int count) {
        for(int i = index ; i >= 0 ; i--) {
            if(S[i] <= res) {
                res = res %= S[i];
                return result(S, index, res, ++count);
            }
        }
        return res+","+count;
    }
    
}