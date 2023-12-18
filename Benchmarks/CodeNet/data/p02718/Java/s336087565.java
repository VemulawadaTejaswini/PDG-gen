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
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] list = new int[N];
        long sum = 0;
        for(int i=0;i<N;i++){
            list[i]=sc.nextInt();
            sum += list[i];
        }
        int cnt = 0;
        for(int i=0;i<N;i++){
            if(list[i]>=sum/4.0/M){
                cnt++;
            }
        }
        System.out.println(cnt>=M?"Yes":"No");
    }

    public static void main(String[] args) {
        new Main();
    }
}
