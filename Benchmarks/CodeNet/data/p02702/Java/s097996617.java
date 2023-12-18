import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int slength = s.length();
        char[] c = s.toCharArray();
        int[] cInt = new int[slength];
        int[] cIntSum = new int[slength+1];
        for (int i=0;i<slength;i++) {
            cInt[s.length()-1-i] = Character.getNumericValue(c[i]);
        }
        cIntSum[0] = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1);
        int n = 1;
        int ans = 0;
        for (int i=1;i<=slength;i++) {
            cIntSum[i] = (cInt[i-1]*n + cIntSum[i-1])%2019;
            if (sumMap.containsKey(cIntSum[i])) {
                ans += sumMap.get(cIntSum[i]);
                sumMap.put(cIntSum[i], sumMap.get(cIntSum[i]) + 1);
            } else {
                sumMap.put(cIntSum[i], 1);
            }
            n *= 10;
            n %= 2019;
        }

        System.out.println(ans);
    }
}


