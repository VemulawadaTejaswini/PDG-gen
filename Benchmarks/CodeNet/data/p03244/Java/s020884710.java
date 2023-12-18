import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] values = new int[N];
        int[] pairCountA = new int[100001];
        int[] pairCountB = new int[100001];

        Map<Integer, Integer> pairACountToValue = new HashMap<>();
        Map<Integer, Integer> pairBCountToValue = new HashMap<>();

        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < N - 2; i++) {
            if (values[i] == values[i + 2]) {
                if (i % 2 == 0) {
                    pairCountA[values[i]] = pairCountA[values[i]] + 1;
                    pairACountToValue.put(pairCountA[values[i]], values[i]);
                } else {
                    pairCountB[values[i]] = pairCountB[values[i]] + 1;
                    pairBCountToValue.put(pairCountB[values[i]], values[i]);
                }
            }
        }
        Arrays.sort(pairCountA);
        Arrays.sort(pairCountB);

        if (pairACountToValue.get(pairCountA[100000]) == pairBCountToValue.get(pairCountA[100000])) {
            System.out.println(N/2);
            return;
        }

        int aChangeCount = (N / 2) - (pairCountA[100000] + 1);
        int bChangeCount =  (N / 2) - (pairCountB[100000] + 1);

        System.out.println(aChangeCount + bChangeCount);
    }


}
