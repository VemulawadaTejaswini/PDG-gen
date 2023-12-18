import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        long K = Long.parseLong(s[1]);
        s = in.readLine().split(" ");
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        if(K - 1 == 0) {
            System.out.print(a[0]);
        }
        else {
            int currTown = 0, cycleLength = 1;
            HashMap<Integer, Integer> set = new HashMap<>();
            set.put(0, cycleLength);
            for(int i = 0; i < a.length; i++ ) {
                int nextTown = a[currTown] - 1;
                if(set.containsKey(nextTown)) {
                    cycleLength = cycleLength - set.get(nextTown) + 1;
                    break;
                } else {
                    set.put(nextTown, ++cycleLength);
                }
                currTown = nextTown;
            }
            long ans = K % cycleLength;
            currTown = 0;
            //if(cycleLength > 0) {
                while(ans-- > 0) {
                    currTown = a[currTown] - 1;
                }
                System.out.println(currTown + 1);
            //}
            //else {
            //    System.out.println(1);
            //}
        }
    }

}
