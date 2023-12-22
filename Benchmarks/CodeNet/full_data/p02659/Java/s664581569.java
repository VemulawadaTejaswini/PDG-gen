
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        long a = Long.parseLong(tokens[0]);
        double b = Double.parseDouble(tokens[1]);
        long[] parts = parts(b);
        long ans = a*parts[0] + (a*parts[1])/100;
        System.out.println(ans);
    }

    private static long[] parts(double b){
        long[] ans = new long[2];
        ans[0] = (long)b;
        ans[1] = (long)((b-ans[0])*100);
        return ans;

    }


}