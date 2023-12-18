import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            if (a[i] == 0) {
                countZero++;
            }
        }
        sc.close();

        // 主処理
        Set<Integer> set = new HashSet<>(Arrays.asList(a));
        boolean judge;
        if (countZero == n) {
            judge = true;
        } else if (n % 3 == 0 && countZero == n / 3 && set.size() == 2) {
            judge = true;
        } else if (n % 3 == 0 && set.size() == 3) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : set) {
                map.put(num, 0);
            }
            for (int i = 0; i < n; i++) {
                map.put(a[i], map.get(a[i]) + 1);
            }
            Set<Integer> valueSet = new HashSet<>();
            int xorSum = 0;
            for (int key : map.keySet()) {
                valueSet.add(map.get(key));
                xorSum = xorSum(xorSum, key);
            }
            judge = valueSet.size() == 1 && xorSum == 0;
        } else {
            judge = false;
        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }

    public static int xorSum(int a, int b) {
        String bina = new StringBuilder(Integer.toBinaryString(a)).reverse().toString();
        String binb = new StringBuilder(Integer.toBinaryString(b)).reverse().toString();
        int minlen = Math.min(bina.length(), binb.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minlen; i++) {
            if (bina.charAt(i) == binb.charAt(i)) {
                sb.append("0");
            } else {
                sb.append("1");
            }
        }
        if (bina.length() < binb.length()) {
            sb.append(binb.substring(minlen));
        } else if (binb.length() < bina.length()) {
            sb.append(bina.substring(minlen));
        }
        return Integer.parseInt(sb.reverse().toString(), 2);
    }
}
