import java.io.*;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    long mod = 1000000000+7;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    String solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sort according to the deadline
        PriorityQueue<int[]> pq = new PriorityQueue<>(n,(o1,o2)->(o1[1]==o2[1]?o1[0]-o2[0]:o1[1]-o2[1]));
        for(int i=0;i<n;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            // b is the deadline. a is the necessary time
            pq.add(new int[]{a,b});
        }
        int time = 0;
        while(pq.size()>0){
            int[] task = pq.poll();
            time += task[0];
            if(time>task[1]) return "No";
        }
        return "Yes";
    }
}

