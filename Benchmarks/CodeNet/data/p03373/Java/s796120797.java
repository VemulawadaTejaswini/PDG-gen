import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aYen = sc.nextInt();// ピザAの値段
        int bYen = sc.nextInt();// ピザBの値段
        int cYen = sc.nextInt();// ピザC(ABピザ)の値段
        int targetACnt = sc.nextInt();
        int targetBCnt = sc.nextInt();

        int cost = Integer.MAX_VALUE;
        int maxCCnt = targetACnt>targetBCnt ? targetACnt*2 : targetBCnt*2;
        for (int i = 0; i <= maxCCnt;i++) {
            int tmpCCnt = i;
            int tmpACnt = Math.max(targetACnt - (tmpCCnt/2), 0);
            int tmpBCnt = Math.max(targetBCnt - (tmpCCnt/2), 0);

            int tmpCost = (aYen*tmpACnt) + (bYen*tmpBCnt) + (cYen*tmpCCnt);
            if (cost > tmpCost) cost = tmpCost;
        }

        System.out.println(cost);
    }
}
