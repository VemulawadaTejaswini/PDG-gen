import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> numMap = new HashMap<>();
        Map<Integer, Integer> resultMap = new HashMap<>();
        int[] numList = new int[N];
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            Integer count = numMap.get(num);
            if (Objects.isNull(count)) {
                numMap.put(num, 1);
            } else {
                numMap.put(num, count + 1);
            }
            numList[i] = num;
        }
        for (int var : numList) {
            Integer result = resultMap.get(var);
            if (Objects.isNull(result)) {
                int val = 0;
                for (Integer value : numMap.keySet()) {
                    int tmp = numMap.get(value);
                    if (value == var) {
                        tmp -= 1;
                    }

                    if (tmp <= 1) {
                        val += 0;
                        continue;
                    }

                    val += tmp * (tmp - 1) / 2;
                }
                System.out.println(val);
                resultMap.put(var, val);
            } else {
                System.out.println(result);
            }
        }
        sc.close();
    }

}
