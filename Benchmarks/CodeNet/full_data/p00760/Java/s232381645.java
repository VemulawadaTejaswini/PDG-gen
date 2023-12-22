import java.util.*;

public class Main {
    public static int NORMAL_YEAR = 195;
    public static int MILL = 196470;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- > 0) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(MILL - calcDaysToYear(y,m,d));
        }
    }
    
    public static int calcDaysToYear(int y, int m, int d) {
        int totalDays = 0;
        if (y > 1) totalDays = (y-1) * NORMAL_YEAR + ((y-1) / 3) * 5;
            
        if (y % 3 == 0) {
            totalDays += (m-1) * 20 + (d-1);
        } else {
            switch (m) {
                case 2: totalDays += 20; break;
                case 3: totalDays += 20 + 19; break;
                case 4: totalDays += 20 * 2 + 19; break;
                case 5: totalDays += 20 * 2 + 19 * 2; break;
                case 6: totalDays += 20 * 3 + 19 * 2; break;
                case 7: totalDays += 20 * 3 + 19 * 3; break;
                case 8: totalDays += 20 * 4 + 19 * 3; break;
                case 9: totalDays += 20 * 4 + 19 * 4; break;
                case 10: totalDays += 20 * 5 + 19 * 4; break;
                default: break;
            }
            totalDays += d - 1;
        }
        return totalDays;
    }
}


