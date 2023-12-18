
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n = 0;
        long[] as = new long[n];
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
            String[] elems = br.readLine().split(" ");
            as = new long[n];
            for (int i = 0; i < n; i++)
                as[i] = Long.parseLong(elems[i]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long ans = 1;
        int i;
        boolean isOrd = false;
        for (i = 1; i < n; i++)
            if (as[i] != as[i-1]) {
                isOrd = !(as[i - 1] < as[i]);
                break;
            }
        for (; i < n; i++) {
            if (as[i-1] == as[i])
                continue;
            if ((isOrd && !(as[i-1] < as[i])) || (!isOrd && !(as[i-1] > as[i]))) {

            }
            else {
                if (i < n - 1)
                    isOrd = !(as[i] < as[i+1]);
                ans++;
            }
        }
        System.out.println(ans);
    }
}
