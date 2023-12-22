import java.awt.*;
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
//给出两个数a,b 求出[a,b]中各位数字之和能整除原数的数的个数。
public class Main {
    int mod  = (int) 1e9+7;
    //int n = (int) 1e6+5;
    //long[][] memo = new long[n][27];
    void solve(int a) {
        int sum = 0;
        int v = 1;
        for(int i=0;i<3;i++){
            v*=a;
            sum+=v;
        }
        System.out.println(sum);
    }
    //0 1 2 3 4 5 6 7
    //1 7 3 4 7 6 2 9
    //1 7 4 3 7 6 2 9;
    //1 2 1 2 1
    public static void main(String[] args)  throws IOException {
        // Use the Scanner class

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]  s = br.readLine().split(" ");
        Main test = new Main();

        int n = Integer.parseInt(s[0]);
        //s = br.readLine().split(" ");
        //s = br.readLine().split(" ");
        test.solve(n);
    }
}
