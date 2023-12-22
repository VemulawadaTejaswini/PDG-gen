import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static final String HIT = "HIT";
    private static final String HOMERUN = "HOMERUN";
    private static final String OUT = "OUT";
    private static final int MAX_OUT_COUNT = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        int outCount = 0;
        int[] bases, points;
        bases = new int[3];
        points = new int[n];
        for (int i = 0; i < n; i++) {
            outCount = 0;
            clearBases(bases);
            while (outCount < MAX_OUT_COUNT) {
                switch (sc.nextLine()) {
                    case HIT:
                        points[i] = hit(points[i], bases);
                        break;
                    case HOMERUN:
                        points[i] = homerun(points[i], bases);
                        break;
                    case OUT:
                        outCount++;
                        break;
                    default:
                }
            }
        }
        ptint(points);
    }

    static void ptint(int[] ps) {
        for (int p : ps) {
            System.out.println(p);
        }
    }

    static int hit(int point, int[] bases) {
        for (int i = (bases.length - 1); i >= 0; i--) {
            if (bases[i] == 1) {
                switch (i) {
                    case 2:
                        bases[i] = 0;
                        point++;
                        break;
                    case 1:
                        bases[i] = 0;
                        bases[i + 1] = 1;
                        break;
                    case 0:
                        bases[i] = 0;
                        bases[i + 1] = 1;
                        break;
                }
            }
        }
        bases[0] = 1;
        return point;
    }

    static int homerun(int point, int[] bases) {
        for (int i = 0; i < bases.length; i++) {
            if (bases[i] == 1) {
                point++;
            }
        }
        point++;
        clearBases(bases);
        return point;
    }

    static void clearBases(int[] bases) {
        for (int i = 0; i < bases.length; i++) {
            bases[i] = 0;
        }
    }
}
