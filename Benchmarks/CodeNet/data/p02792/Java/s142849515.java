import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        long N = sc.nextLong();
        int[][] cnt = new int[10][10];
        for(int i=1;i<N;i++){
            int st = Integer.parseInt(String.valueOf(i).substring(0, 1));
            int ft = i%10;
            cnt[st][ft]++;
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                ans += cnt[i][j]*cnt[j][i];
            }
        }
        /*
        int grade = String.valueOf(N).length();
        if (N < 10) {
            System.out.println(N);
            return;
        }
        ans += 9;// 1
        for (int g = 1; g <= grade - 1; g++) {// 2<= g <=grade-1
            ans += 81L * Math.pow(10, g * 2);
        }
        int f1 = Integer.parseInt(String.valueOf(N).substring(0, 1));
        ans += f1 * f1 * Math.pow(10, (grade - 2) * 2);
    */
        System.out.println(ans);
    }
}
