import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long x = Long.parseLong(st.nextToken());
        long ans = 0;
        //assume init is 1
        //keep adding 5+6
        long mod = x%11;
        long quot = x/11;

        if (mod>1)
            ans++;
        if (mod>=7)
            ans++;
        ans+=2*quot;

        System.out.println(ans);

    }


}
