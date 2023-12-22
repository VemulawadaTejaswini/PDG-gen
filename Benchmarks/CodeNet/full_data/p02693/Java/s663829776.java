import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Integer k = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] s = str.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        for (int i = a; i <= b; i++) {
            if(i % k == 0 ){
                System.out.println("OK");
                return;
            }
        }
        System.out.println("NG");
    }


}
