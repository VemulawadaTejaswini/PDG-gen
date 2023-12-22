import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        char[] seq = sc.next().toCharArray();
        boolean[] red = new boolean[N];
        for (int i = 0; i < N; i++)
            red[i] = seq[i] == 'R';

        int left = 0;
        int right = N-1;
        while(left<right){
            if(!red[left]&&red[right]){
                ans++;
                left++;
                right--;
            }else if(red[left]){
                left++;
            }else if(!red[right]){
                right--;
            }else{
                left++;
                right--;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
