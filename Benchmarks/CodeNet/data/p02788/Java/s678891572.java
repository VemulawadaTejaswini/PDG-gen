import java.io.*;
import java.util.*;

public class Main {
    int n;
    long A,D;
    PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    // greed. No need for advanced structure. A simply deque would work.
    long solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); D = sc.nextInt(); A = sc.nextInt();
        int[][] pos_hp = new int[n][];
        for(int i=0;i<n;i++){
            int pos = sc.nextInt(), hp = sc.nextInt();
            pos_hp[i] = new int[]{pos,hp};
        }
        Arrays.sort(pos_hp,(o1,o2)->(o1[0]-o2[0])); // sort according to the x_pos
        Deque<long[]> queue = new LinkedList<>(); // int[]{end_position, damage at this operation}
        long cur_all_damage = 0, ans = 0;
        for(int start = 0; start < n; start++){
            int[] curMonster = pos_hp[start];
            while(queue.size()>0&&queue.peek()[0]<curMonster[0]){
                long[] temp = queue.poll();
                cur_all_damage -= temp[1];
            }
            if(cur_all_damage >= curMonster[1]) continue; // this monster can be killed by previous moves
            else{
                long left = curMonster[1]-cur_all_damage;
                long moves = (left-1)/A+1;
                ans += moves;
                long d_damage = moves*A;
                cur_all_damage += d_damage;
                queue.addLast(new long[]{curMonster[0]+2*D, d_damage});
            }
        }
        return ans;
    }
}

