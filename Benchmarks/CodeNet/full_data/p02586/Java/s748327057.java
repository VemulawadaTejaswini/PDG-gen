import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        long[][] masu = new long[R][C];
        for(int i=0;i<K;i++){
            int r,c;
            long v;
            r = sc.nextInt()-1;
            c = sc.nextInt()-1;
            v = sc.nextLong();
            masu[r][c] = v;
        }
        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingLong(State::getVal));
        long[] top3 = new long[3];
        Arrays.fill(top3, 0);
        for(int i=0;i<C;i++) {
            long probe = masu[0][i];
            if (top3[0] < probe) {
                top3[2] = top3[1];
                top3[1] = top3[0];
                top3[0] = probe;
            } else if (top3[1] < probe) {
                top3[2] = top3[1];
                top3[1] = probe;
            } else if (top3[2] < probe) {
                top3[2] = probe;
            }
            long addedVal = top3[0] + top3[1] + top3[2];
            pq.add(new State(1, i, addedVal+masu[1][i], 0));
        }
        long anss= 0;
        while(!pq.isEmpty()){
            State now = pq.poll();
            if(now.c == C-1 && now.r == R-1){
                anss = Math.max(anss, now.val);
            }
            if(now.r+1 < R)
                pq.add(new State(now.r+1, now.c, now.val+masu[now.r+1][now.c], 0));//sonomama oriru
            long[] top2 = new long[2];
            Arrays.fill(top2, 0);
            for(int i=now.c+1;i<C;i++){//top2 toru
                long probe = masu[now.r][i];
                if(top2[0] < probe){
                    top2[1] = top2[0];
                    top2[0] = probe;
                }else if(top2[1] < probe) {
                    top2[1] = probe;
                }
                long addedVal = top2[0]+top2[1];
                if(now.r+1 < R)
                    pq.add(new State(now.r+1, i, now.val + addedVal + masu[now.r+1][i], 0));
                //System.out.print(i + "-" + addedVal + " ");
            }
            //System.out.println();
        }
        System.out.println(anss);
        return;
    }

    public static class State{
        int r,c;
        long val;
        int nxtDir;//0:R 1:D
        public State(int r, int c, long val, int nxtDir){
            this.r=r;
            this.c=c;
            this.val=val;
            this.nxtDir = nxtDir;
        }
        public long getRow(){
            return r;
        }
        public long getCol(){
            return c;
        }
        public long getVal(){
            return val;
        }
    }

}
