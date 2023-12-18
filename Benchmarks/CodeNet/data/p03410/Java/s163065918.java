
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        long[] a = new long[n];
        long[] b = new long[n];
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        HashMap<Long, Integer> hashMap1 = new HashMap<>();
        HashMap<Long, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long value = Long.parseLong(tokn.nextToken());
            hashMap1.put(value, hashMap1.getOrDefault(value, 0) + 1);
        }

        tokn = new StringTokenizer(input.readLine());
        for (int i = 0; i < n; i++) {
            long value = Long.parseLong(tokn.nextToken());
            hashMap2.put(value, hashMap2.getOrDefault(value, 0) + 1);
        }
        long xor = -1;
        for (Map.Entry<Long, Integer> entry : hashMap1.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                for (Map.Entry<Long, Integer> entry2 : hashMap2.entrySet()) {
                    if (entry2.getValue() % 2 != 0) {
                        if (xor == -1) {
                            xor = entry.getKey() + entry2.getKey();
                        } else {
                            xor = xor ^ (entry.getKey() + entry2.getKey());
                        }
                    }
                }

            }
        }
        System.out.println(xor);
    }
}
