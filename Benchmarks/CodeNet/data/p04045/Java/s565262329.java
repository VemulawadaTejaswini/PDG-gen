import java.util.*;

public class Main {
        static int n;
        static int k;
        static int min;

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                try {
                        n = sc.nextInt();
                        k = sc.nextInt();
                        Map<Integer, Boolean>  dMap = new HashMap<>();
                        // 繰り上げのために最小の桁を保存しておく
                        for (int i = 0; i<k; i++) {
                                int d = sc.nextInt();
                                // 嫌いな数字はTRUEにしてMapに入れる
                                dMap.put(d, true);
                        }
                        min = getMinFromInput(dMap);
                        int num = n;
                        // 繰り上げがあると、嫌いな数字が含まれてしまうことがある
                        while (hasHateNum(dMap, num)) {
                                num = getMinAmountWithoutDNum(dMap, num);
                        }
                        System.out.println(num);
                } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("入力値が不正です");
                }
        }
  
  
        private static int getMinAmountWithoutDNum(Map<Integer, Boolean> dMap, int num) {
                int amount = 0;
                // 10~1000でnumを割って各桁の数を支払える最小を調べる
                for (int fig = 1; num > 0; fig = fig * 10) {
                        // 桁上げ用
                        int upfig = 1;
                        int div = num % 10;
                        // Mapに入っていれば、嫌いなので一つ大きい数で支払う
                        while (dMap.containsKey(div) && dMap.get(div)) {
                                // 支払えない時は繰り上げる
                                if (div >= 9) {
                                        // 繰り上げ
                                        div = 1;
                                        amount = 1111 * min;
                                        amount = amount % (fig*10);
                                        upfig *= 10;
                                } else {
                                        div++;
                                        amount = 1111 * min;
                                        amount = amount % (fig * upfig);
                                }
                        }
                        num = num / 10;
                        amount += div * fig * upfig;
                }
                return amount;
        }
  
  
        private static int getMinFromInput(Map<Integer, Boolean> dMap) { 
                int min = 0;
                do {
                        if (!dMap.containsKey(min)) {
                                // 最小値が見つかったのでおわり
                                break;
                        }
                        min++;
                } while (true);
                return min;
        }

        private static boolean hasHateNum(Map<Integer, Boolean> dMap, int amount) {
                String amountStr = String.valueOf(amount);
                for (Integer dNum : dMap.keySet()) {
                        if (amountStr.contains(String.valueOf(dNum))) {
                                 return true;
                        }
                }
                return false;
        }
}