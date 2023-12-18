import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        if((A + B) % 2 == 0) {
            System.out.println((A + B) / 2);
        }else {
            System.out.println("IMPOSSIBLE");
        }
    }
}