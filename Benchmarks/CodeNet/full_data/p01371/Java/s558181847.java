import java.util.*;

class Main{

    int n;
    int[][] t;
    int[] hand;
    PriorityQueue<int[]> q;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            if(n==0) break;
            
            //pos, time, mask
            q = new PriorityQueue<int[]>(n, new Comparator<int[]>(){
                        public int compare(int[] a, int[] b){
                            return a[1] - b[1];
                        }
                    });
            
            t = new int[n][n];
            hand = new int[n];

            for(int i=0; i<n; i++){
                hand[i] = sc.nextInt();
                q.add(new int[]{i, hand[i], 1<<i});
                for(int j=0; j<n; j++){
                    t[i][j] = sc.nextInt();
                }
            }
                                       
            System.out.println(dijkstra());
        }
    }

    int dijkstra(){
        int[] v = new int[1<<n];
        Arrays.fill(v, Integer.MAX_VALUE);

        while(q.size()>0){
            int[] qq = q.poll();
            int pos = qq[0], time = qq[1], mask = qq[2];

            if(mask==((1<<n)-1)) return time;

            if(v[mask]<time) continue;
            v[mask] = time;

            for(int i=0; i<n; i++){
                if((mask&(1<<i))==0){
                    int min = hand[i];
                    for(int j=0; j<n; j++){
                        if((mask&(1<<j))>0) min = t[i][j];
                    }
                    q.add(new int[]{i, time+min, mask^(1<<i)});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}