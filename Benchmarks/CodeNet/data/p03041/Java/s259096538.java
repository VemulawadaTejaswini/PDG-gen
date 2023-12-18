import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        String str = stdR.readLine();
        System.out.println(str.substring(0, K - 1)+(char)(str.charAt(K - 1) + 32) +str.substring(K, N));
    }
}
