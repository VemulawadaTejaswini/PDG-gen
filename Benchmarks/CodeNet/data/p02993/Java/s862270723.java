import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static final int MOD = 1000000009;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        */

        char[] s = br.readLine().toCharArray();
        boolean flag = false;
        for(int i = 0; i < 3; i++) {
            if(s[i] == s[i + 1]) {
                flag = true;
                break;
            }
        }
        System.out.println(flag? "Bad" : "Good");
    }
}