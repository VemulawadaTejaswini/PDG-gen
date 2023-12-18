
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] Ai = new int[N];
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i=0; i<N; i++) {
            Ai[i] = scanner.nextInt();
            Integer count = countMap.get(Ai[i]);
            if (count == null) {
                countMap.put(Ai[i], 1);
            } else {
                countMap.put(Ai[i], count + 1);
            }
        }

        int sumAll = 0;
        Map<Integer, Integer> sumMapA = new HashMap<>();
        Map<Integer, Integer> sumMapB = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            Integer key = entry.getKey();
            int count = entry.getValue();
            Integer conbi = (count * (count - 1)) / 2;
            sumMapA.put(key, conbi);
            sumAll += conbi;

            count--;
            conbi = (count * (count - 1)) / 2;
            sumMapB.put(key, conbi);
        }

        for (int k=0; k < N; k++) {
            Integer sum = sumAll - sumMapA.get(Ai[k]) + sumMapB.get(Ai[k]);
            System.out.println(sum);
        }
    }

}
