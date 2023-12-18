import java.util.*;
import java.lang.Math;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spotCnt = sc.nextInt();
        int spots[] = new int[spotCnt];
        for (int i = 0; i < spotCnt; i++) {
            spots[i] = sc.nextInt();
        }
        int sum = Math.abs(spots[0]);
        for (int i = 0; i < spotCnt; i++) {
            if (i == spotCnt - 1) {
                sum += Math.abs(spots[i]);
            } else {
                sum += Math.abs(spots[i + 1] - spots[i]);
            }
        }
        System.out.println("sum: "+sum);

        for (int skipSpot = 0; skipSpot < spotCnt; skipSpot++) {
            int d = 0;
            if (skipSpot == spotCnt - 1) {
                d = Math.abs(spots[skipSpot]) + Math.abs(spots[skipSpot] - spots[skipSpot - 1])
                    - Math.abs(spots[skipSpot - 1]);
            } else if (skipSpot == 0) {
                d = Math.abs(spots[skipSpot]) + Math.abs(spots[skipSpot + 1] - spots[skipSpot])
                    - Math.abs(spots[skipSpot + 1]);
            } else {
                d = Math.abs(spots[skipSpot + 1] - spots[skipSpot]) + Math.abs(spots[skipSpot] - spots[skipSpot - 1])
                    - Math.abs(spots[skipSpot + 1] - spots[skipSpot - 1]);
            }
            System.out.println(sum - d);
        }
    }
}