import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int[] time = new int[5];
        for (int i=0; i < 5; i++)
            time[i] = sc.nextInt();

        int minIndex = 0;
        int minModulusTime = 10;
        for (int i=0; i < 5; i++) {
            if (modulusTime(time[i]) < minModulusTime) {
                minIndex = i;
                minModulusTime = modulusTime(time[i]);
            }
        }

        int count = 0;

        for (int i=0; i < 5; i++) {
            if (i != minIndex)
                count += actualTime(time[i]);
            else
                count += time[i];
        }

        System.out.println(count);

    }

    private static int modulusTime(int time) {
        if (time % 10 == 0) return 10;
        return time % 10;
    }

    private static int actualTime(int time) {
        if (time % 10 == 0) return time;
        return time + (10 - time % 10);
    }

}
