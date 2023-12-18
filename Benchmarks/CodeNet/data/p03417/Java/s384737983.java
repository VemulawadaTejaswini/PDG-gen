import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();

        // 四隅
        long cornerNums = Math.min(N, 2) * Math.min(M, 2);
        long cornerNeighborNums = Math.min(N, 2) * Math.min(M, 2);
        boolean isCornerFaceDown = cornerNeighborNums % 2 != 0 ? true : false;   //隣り合うカードの枚数が奇数

        // 上・下
        long upperDownNums = Math.max(M - 2, 0) * Math.min(N, 2);
        long upperNeighborNums = Math.max(N - 2, 1) * M * 3;
        boolean isUpperFaceDown = upperNeighborNums % 2 != 0 ? true : false;

        // 左・右
        long leftRightNums = Math.max(N - 2, 0) * Math.min(M, 2);
        long leftNeighborNums = Math.min(M - 2, 1) * N * 3;
        boolean isLeftFaceDown = leftNeighborNums % 2 != 0 ? true : false;

        // 中心(裏向き)
        long anotherNum = N * M - cornerNums - upperDownNums - leftRightNums;

        long ans = anotherNum;
        if(isCornerFaceDown){
            ans += cornerNums;
        }

        if(isUpperFaceDown){
            ans += upperDownNums;
        }

        if(isLeftFaceDown){
            ans += leftRightNums;
        }

        out.println(ans);
    }
}