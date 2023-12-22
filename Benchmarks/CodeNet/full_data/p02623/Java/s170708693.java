import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] inp = buffer.readLine().split(" ");
        int n = Integer.parseInt(inp[0]), m = Integer.parseInt(inp[1]), k = Integer.parseInt(inp[2]);
        inp = buffer.readLine().split(" ");
        int a[] = new int[n], b [] = new int[m];
        for (int pos = 0; pos < n; pos++) {
            a[pos] = Integer.parseInt(inp[pos]);
        }
        inp = buffer.readLine().split(" ");
        for (int pos = 0; pos < m; pos++) {
            b[pos] = Integer.parseInt(inp[pos]);
        }
        long totTime = 0;
        int posA = 0, posB = 0, cnt = 0;
        while (totTime < k && (posA< n && posB < m) )
        {
            int time = 0;
            if (a[posA]< b[posB])
            {
                time = a[posA];
                if (time+totTime > k)break;
                posA++;
            }
            else if (a[posA] > b[posB])
            {
                time = b[posB];
                if (time+totTime > k)break;
                posB++;
            }
            if (time==0)break;
            totTime+=time;
            cnt++;
        }
        while (totTime < k && posA < n)
        {
            if (a[posA]+totTime > k)break;
            totTime += a[posA];
            posA++;
            cnt++;
        }
        while (totTime < k && posB < m)
        {
            if (b[posB]+totTime > k)break;
            totTime += b[posB];
            posB++;
            cnt++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
