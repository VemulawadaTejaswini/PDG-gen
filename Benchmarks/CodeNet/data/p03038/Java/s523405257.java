
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        Comp cmp = new Comp();
        cmp.set_index(1);
        int[][] bc = new int[m][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                bc[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(bc, cmp);
        int done;
        long ans = 0;

        for (int i = 0; i < m; i++) {
            done=0;
            while(queue.peek()<bc[m-i-1][1]&&done<bc[m-i-1][0]){
                queue.add(queue.poll()*0+bc[m-1-i][1]);
                done++;
            }
        }
        for(int i=0;i<n;i++){
            ans+=queue.poll();
        }
        System.out.println(ans);
    }
}

    class Comp implements Comparator {

        int index = 0;

        void set_index(int i) {
            index = i;
        }

        public int compare(Object a, Object b) {
            int[] int_a = (int[]) a;
            int[] int_b = (int[]) b;
            return (int_a[index] - int_b[index]);
        }

    }
