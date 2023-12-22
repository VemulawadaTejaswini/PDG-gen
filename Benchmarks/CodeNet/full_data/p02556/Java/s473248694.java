import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);

        int[] xList = new int[num];
        int[] yList = new int[num];
        for (int i = 0; i < num; i++) {
            line = sc.nextLine();
            String[] lines = line.split(" ", 0);
            xList[i] = Integer.parseInt(lines[0]);
            yList[i] = Integer.parseInt(lines[1]);
        }

        long min = Long.MAX_VALUE;
        int minNumber = 0;
        long max = 0;
        int maxNumber = 0;
        for (int i = 0; i < num; i++) {
            if (xList[i] + yList[i] > max) {
                max = xList[i] + yList[i];
                maxNumber = i;
            }
            if (xList[i] + yList[i] < min) {
                min = xList[i] + yList[i];
                minNumber = i;
            }
        }

        long ret = Math.abs(xList[maxNumber] - xList[minNumber]) + Math.abs(yList[maxNumber] - yList[minNumber]);

        System.out.println(ret);
    }
}