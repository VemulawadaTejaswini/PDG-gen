/**
 * Created by ChingYee on 13/3/2017.
 */
import java.util.*;

public class Main {

    public static int minBus(int maxPassenger, int timeLimit, int[] arriveTime) {
        if (arriveTime.length == 0) return 0;
        Arrays.sort(arriveTime);
        int result = 1;
        int curPassenger = 0;
        int busTime = arriveTime[0] + timeLimit;
        // 2 6 6 7 8 10
        for (int i = 0; i < arriveTime.length; i++) {
            if (curPassenger == maxPassenger || arriveTime[i] > busTime) {
                result++;
                busTime = arriveTime[i] + timeLimit;
                curPassenger = 0;
            }
            curPassenger++;
        }
        return result;
    }

    public static int minBus2(int maxPassenger, int timeLimit, int[] arriveTime) {
        int result = 1;
        int curPassenger = 0;
        Arrays.sort(arriveTime);
        int busTime = arriveTime[arriveTime.length-1];
        for (int i = arriveTime.length-1; i >= 0; i--) {
            if (curPassenger == maxPassenger || arriveTime[i]+timeLimit < busTime) {
                result++;
                busTime = arriveTime[i];
                curPassenger = 0;
            }
            curPassenger++;
        }
        return result;
    }



    public static String longestUniqueSub(String s) {
        if (s.length() <= 1) return s;
        int currentStart = 0;
        int resultStart = 0;
        int resultEnd = 0;
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen.contains(c)) {
                seen.add(c);
                if ((i-currentStart) > (resultEnd-resultStart)) {
                    resultStart = currentStart;
                    resultEnd = i;
                }
            } else {
                while (s.charAt(currentStart) != c) {
                    seen.remove(s.charAt(currentStart));
                    currentStart++;
                }
                currentStart++;
            }
        }
        return s.substring(resultStart, resultEnd+1);
    }

    public static boolean isInRange(int currentDifficulty, int nextDifficulty) {
        int difference = nextDifficulty - currentDifficulty;
        if (difference <= 0 || difference > 10) return false;
        return true;
    }

    public static int addProblems(int[] difficulties) {
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < difficulties.length; i++) {
            queue.add(difficulties[i]);
        }

        int difficulty = -1;
        int problemsLeft = 4;
        while (!queue.isEmpty()) {
            if (difficulty == -1 || isInRange(difficulty, queue.peek())) {
                difficulty = queue.remove();
                problemsLeft--;
            } else {
                difficulty += 10;
                problemsLeft--;
                result++;
            }
            if (problemsLeft == 0) {
                problemsLeft = 4;
                difficulty = -1;
            }
        }

        if (problemsLeft != 4)
            result += problemsLeft;

        return result;
    }

    public static int addProblems2(int[] difficulties) {
        int result = 0;

        int problemsLeft = 4;
        int difficulty = -1;
        for (int i = 0; i < difficulties.length; i++) {
            int curDifficulty = difficulties[i];
            if (difficulty == -1 || isInRange(difficulty, curDifficulty)) {
                difficulty = curDifficulty;
                problemsLeft--;
            } else {
                difficulty += 10;
                problemsLeft--;
                result++;
                i--;
            }
            if (problemsLeft == 0) {
                problemsLeft = 4;
                difficulty = -1;
            }
        }

        if (problemsLeft != 4)
            result += problemsLeft;

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numPassengers = in.nextInt();
        int maxPassenger = in.nextInt();
        int timeLimit = in.nextInt();
        int[] arriveTime = new int[numPassengers];
        for (int i = 0; i < numPassengers; i++) {
            arriveTime[i] = in.nextInt();
        }

        System.out.print(minBus(maxPassenger, timeLimit, arriveTime));
        /*
        System.out.println(longestUniqueSub("ABDEFGABEF"));
        System.out.println(longestUniqueSub("BBBB"));
        System.out.println(longestUniqueSub("GEEKSFORGEEKS"));
        */
        /*
        5
        4
        10 15 25 30
        4
        15 20 25 40
        3
        3 3 3
        8
        60 90 61 62 63 91 92 93
        11
        5 14 30 32 39 46 47 47 30 58 47
                */

        /*
        int[] test1 = new int[] { 10, 15, 25, 30 };

        int[] test2 = new int[] { 15, 20, 25, 40 };

        int[] test3 = new int[] { 3, 3, 3 };

        int[] test4 = new int[] { 60, 90, 61, 62, 63, 91, 92, 93 };

        int[] test5 = new int[] { 5, 14, 30, 32, 39, 46, 47, 47, 30, 58, 47 };

        System.out.println(addProblems2(test1));

        System.out.println(addProblems2(test2));

        System.out.println(addProblems2(test3));

        System.out.println(addProblems2(test4));

        System.out.println(addProblems2(test5));
        */
    }
}
