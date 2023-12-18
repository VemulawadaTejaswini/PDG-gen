import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();

        List<Integer> switches = new ArrayList<>();
        switches.add(0);
        boolean currentIsReverse = (S.charAt(0) == '1');

        for (int i = 1; i < N; i++) {
            boolean isReverse = (S.charAt(i) == '1');
            if (isReverse != currentIsReverse) {
                switches.add(i);
            }
            currentIsReverse = isReverse;
        }

        int numOfSwitch = switches.size();
        int maxSum = 0;


        for (int i = 0; i < numOfSwitch; i++) {
            boolean isFirstReverse = (S.charAt(switches.get(i)) == '1');

            int endIndex = i + 2 * K + (isFirstReverse ? 1 : 0);
            int sum = ((endIndex < numOfSwitch) ? switches.get(endIndex) : N) - switches.get(i);

            if (maxSum < sum) maxSum = sum;
        }

        System.out.println(maxSum);

    }
}
