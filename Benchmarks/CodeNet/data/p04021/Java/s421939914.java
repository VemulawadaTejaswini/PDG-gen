import java.util.*;

/**
 * Created on 2016/08/21.
 */
public class Main{

    final static int NUM = (int)(1e5 + 2);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] idices = new int[NUM];

        PriorityQueue<Integer> nums = new PriorityQueue<>();

        for(int i=0; i<N; i++){
            int tmp = sc.nextInt();
            nums.add(tmp);
            idices[tmp] = i;
        }

        int bin = 0;
        int diff = 0;

        while(!nums.isEmpty()){
            int num = nums.poll();
            int idx = idices[num];

            if((bin%2) != (idx%2)){
                diff++;
            }

            //
            bin++;
            bin %= 2;
        }

        int ans = (diff / 2);

        System.out.println(ans);
    }
}
