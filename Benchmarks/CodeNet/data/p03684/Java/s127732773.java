import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] rec = new int[N][];
        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            rec[i] = new int[]{i,x,y};
        }
        HashMap<Integer,Integer>[] map = new HashMap[N];
        for(int i=0;i<N;i++) map[i] = new HashMap<>();
        Arrays.sort(rec, new myComX());
        for(int i=0;i<N-1;i++){
            int dist = rec[i+1][1]-rec[i][1];
            map[rec[i][0]].put(rec[i+1][0],dist);
            map[rec[i+1][0]].put(rec[i][0],dist);
        }
        Arrays.sort(rec,new myComY());
        for(int i=0;i<N-1;i++){
            int dist = rec[i+1][2]-rec[i][2];
            map[rec[i][0]].put(rec[i+1][0],dist);
            map[rec[i+1][0]].put(rec[i][0],dist);
        }
        HashSet<Integer> vis = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(10,new myComEdge());
        vis.add(0);
        for(Integer w:map[0].keySet()) pq.add(new int[]{w,map[0].get(w)});
        long ans = 0;
        while(vis.size()<N){
            int[] cur = pq.poll();
            int now = cur[0];
            if(vis.contains(now)) continue;
            vis.add(now);
            ans += cur[1];
            for(Integer w:map[now].keySet()){
                if(!vis.contains(w)) pq.add(new int[]{w,map[now].get(w)});
            }
        }
        System.out.println(ans);
    }

    static class myComX implements Comparator<int[]>{
        public int compare(int[] a, int[] b){return a[1]-b[1];}
    }
    static class myComY implements Comparator<int[]>{
        public int compare(int[] a, int[] b){return a[2]-b[2];}
    }
    static class myComEdge implements Comparator<int[]>{
        public int compare(int[] a, int[] b){return a[1]-b[1];}
    }
}
