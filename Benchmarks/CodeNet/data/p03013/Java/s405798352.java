import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> brokenTyles = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            brokenTyles.add(sc.nextInt());
        }
        sc.close();

        long minusOne = 0;
        long minusTwo = 0;
        if (brokenTyles.contains(1)) {
            minusTwo = 0;
        } else {
            minusTwo = 1;
        }

        if (N > 1) {
            if (brokenTyles.contains(2)) {
                minusOne = 0;
            } else {
                minusOne = minusTwo + 1;
            }
        }
        long baseVal = (long) Math.pow(10, 9) + 7;
        long currentVal = 0;

        for (int i = 3; i <= N; i++) {
            if (brokenTyles.contains(i)) {
                currentVal = 0;
            } else {
                currentVal = (minusOne + minusTwo) % baseVal;
                if (currentVal == 0) {
                    break;
                }
            }
            minusTwo = minusOne;
            minusOne = currentVal;
        }

        System.out.println(currentVal);
    }

}
