import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        String [] inp = buffer.readLine().split(" ");
        Integer []arr = new Integer[n];
        int [] arr2 = new int[n];
        for (int pos = 0; pos < n; pos++) {
            arr[pos] = Integer.parseInt(inp[pos]);
        }
        inp = buffer.readLine().split(" ");
        for (int pos = 0; pos < n; pos++) {
            arr2[pos] = Integer.parseInt(inp[pos]);
        }
        TreeMap<Integer, Integer>freqForArr2 = new TreeMap<>();
        for (int pos = 0; pos < n; pos++) {
            if (arr[pos] != arr2[pos])continue;
            int i = arr2[pos];
            freqForArr2.put(i, freqForArr2.getOrDefault(i, 0)+1);
        }
        boolean check = true;
        for (int pos = 0; pos < n; pos++) {
            if (arr[pos] != arr2[pos])continue;
            Integer higherKey = freqForArr2.higherKey(arr[pos]), lowerKey = freqForArr2.lowerKey(arr[pos]), key = -1;
            if (higherKey == null && lowerKey == null){
                check = false;
                break;
            }
            if (higherKey != null && higherKey > arr[pos])
                key = higherKey;
            else if (lowerKey < arr[pos])
                key = lowerKey;
            else {
                check = false;
                break;
            }
            freqForArr2.put(key, freqForArr2.get(key)-1);
            if (freqForArr2.get(key) == 0)
                freqForArr2.remove(key);
            arr2[pos] = key;
        }
        if (!check)
            System.out.println("No");
        else {
            System.out.println("Yes");
            for (int num : arr2) {
                System.out.print(num + " ");
            }
        }
    }
}
