import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] seats = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0};
        int[] groupMembers = new int[] {2, 5, 2, 2, 2};
        int[] eatTimes = new int[] {19, 39, 25, 36, 22, 42};

        int headGroup = -1;
        int pastMinutes = 0;
        int customerCount = 0;
        List<Integer> waitTime = new ArrayList<Integer>(100);

        while (customerCount < 100) {
            // たべおわる
            for (int i = 0; i < seats.length; i++) {
                seats[i] = seats[i] == 0 ? 0 : seats[i] - 1;
            }

            // 来店
            if (headGroup == -1 && pastMinutes % 5 == 0) {
                headGroup = pastMinutes / 5;
            }

            // ちゃくせき
            while (headGroup != -1) {
                int sequencialSeats = 0;
                int startIndex = -1;
                for (int i = 0; i < seats.length; i++) {
                    sequencialSeats = seats[i] == 0 ? sequencialSeats + 1 : 0;

                    if (sequencialSeats == groupMembers[headGroup % 5]) {
                        startIndex = i - (groupMembers[headGroup % 5] - 1);
                        break;
                    }
                }

                if (startIndex != -1) {
                    // すわれたみたい
                    waitTime.add(headGroup, pastMinutes - (headGroup * 5));
                    for (int i = startIndex; i < (startIndex + groupMembers[headGroup % 5]); i++) {
                        seats[i] = eatTimes[headGroup % 6];
                    }

                    headGroup = (((headGroup + 1) * 5) <= pastMinutes) ? headGroup + 1
                            : -1;
                    customerCount++;
                } else {
                    // すわれなかったみたい
                    break;
                }

            }

            pastMinutes++;

        }

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(waitTime.get(sc.nextInt()));
        }

    }
}