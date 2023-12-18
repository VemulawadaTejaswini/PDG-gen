import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class MyScanner {
    BufferedReader br;

    MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int intLine() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public String line() throws IOException {
        return br.readLine();
    }

    public int[] intArray() throws IOException {
        String[] in = br.readLine().split(" ");
        int n = in.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            res[i] = Integer.parseInt(in[i]);
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner();

        int[] in = sc.intArray();
        int l = in[0];
        int r = in[1];

        /*
        int min = 2019;
        boolean minIsR = true;
        int max = 0;
        boolean maxIsL = true;
        for(int i = l; i <= r; i++) {
            int remainder = i % 2019;
            if(min >= remainder) {
                min = remainder;
                minIsR &= (i == r);
            }
            if(max <= remainder) {
                max = remainder;
                maxIsL &= (i == l);
            }
        }
        if(min == 0) {
            System.out.println(0);
        }else {
            int ans = 2019;
            if(!minIsR) {
                ans = Math.min(ans, (min * (min + 1)) % 2019);
            }
            if(!maxIsL) {
                ans = Math.min(ans, (max * (max - 1)) % 2019);
            }
            System.out.println(ans);
        }
        */

        int ans = 2019;
        for(int i = l; i < r; i++) {
            ans = Math.min(ans, ((i % 2019) * ((i + 1) % 2019)) % 2019);
        }
        System.out.println(ans);

        sc.br.close();
    }
}