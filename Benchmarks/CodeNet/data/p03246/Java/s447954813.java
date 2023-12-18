import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class c {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(f.readLine());
        int[] ar = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int toReplace = 0;
        HashMap<Integer, Integer> occurence = new HashMap<Integer, Integer>();
        int mostOccured = 0;
        int mostOccuredNum = -1;
        int secondMostOccured = 0;
        for (int i = 0; i < n; i += 2) {
            int num = ar[i];
            if (!occurence.containsKey(num)) {
                occurence.put(num, 1);
            } else {
                occurence.put(num, occurence.get(num) + 1);
            }

            if (occurence.get(num) > mostOccured) {
                mostOccured = occurence.get(num);
                mostOccuredNum = num;
            }
            if (num != mostOccuredNum) {
                if (occurence.get(num) > secondMostOccured) {
                    secondMostOccured = occurence.get(num);

                }
            }
        }

        occurence = new HashMap<Integer, Integer>();
        int mostOccured2 = 0;
        int mostOccuredNum2 = -1;
        int secondMostOccured2 = 0;
        for (int i = 1; i < n; i += 2) {
            int num = ar[i];
            if (!occurence.containsKey(num)) {
                occurence.put(num, 1);
            } else {
                occurence.put(num, occurence.get(num) + 1);
            }

            if (occurence.get(num) > mostOccured2) {
                mostOccured2 = occurence.get(num);
                mostOccuredNum2 = num;
            }
            if (num != mostOccuredNum2) {
                if (occurence.get(num) > secondMostOccured2) {
                    secondMostOccured2 = occurence.get(num);
                }
            }
        }
        
        if (mostOccuredNum != mostOccuredNum2) {
            System.out.println(n - mostOccured - mostOccured2);
        } else {
            System.out.println(Math.min(n - mostOccured - secondMostOccured2, n - mostOccured2 - secondMostOccured));
        }
    }
}
