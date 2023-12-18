import java.util.*;

public class Main {

    public static int minBus(int maxPassenger, int timeLimit, int[] arriveTime) {
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
    }
}
