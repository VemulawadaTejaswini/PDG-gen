import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        long ppl = sc.nextLong();
        long[] time = new long[5];
        for (int i=0; i < 5; i++)
            time[i] = sc.nextLong();

        int minIndex = minIndex(time);
        long slowestPass = ppl / time[minIndex] + (ppl % time[minIndex] == 0 ? 0 : 1);

        System.out.println(slowestPass + 4);

    }

    private static int minIndex(long[] list) {
        int index = 0;
        long min = Long.MAX_VALUE;
        for (int i=0; i < list.length; i++) {
            if (list[i] < min) {
                index = i;
                min = list[i];
            }
        }
        return index;
    }

}
