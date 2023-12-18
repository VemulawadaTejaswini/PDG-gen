import java.util.*;

class Main{

    class Pair{
        int[] line;
        long goal;
        Pair(int[] line, long goal){
            this.line = line;
            this.goal = goal;
        }
    }

    LinkedList<Pair> list;
    HashSet<Long> hash;
    HashSet<Long> hashmiddle;
    int n;
    long allGoal = 1;

    void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] line = new int[n];
        for(int i=0; i<n; i++){
            line[i] = sc.nextInt();
            if(i!=0) allGoal = allGoal * 10 + (i + 1);
        }

        list = new LinkedList<Pair>();
        hash = new HashSet<Long>();
        hashmiddle = new HashSet<Long>();
        list.add(new Pair(line, 0));
        //hashmiddle.add(hash(line, 0));
        bfs();
        System.out.println(hash.size() % 1000000007);
    }

    void bfs(){
        while(list.size()>0){
            Pair p = list.poll();
            int[] line = p.line; long goal = p.goal;

            //if(!hashmiddle.add(hash(line, goal))) continue;
            if(goal>=allGoal) {boolean add = hash.add(goal); continue;}
            //System.out.println(goal+" "+Arrays.toString(line));

            for(int i=0; i<n; i++){
                if(line[i]<=0) continue;
                for(int j=1; j<=2; j++){
                    if(impossible(line, i, j)) continue;
                    int[] nline = move(line, i, j);
                    long ngoal = goal(nline, i, goal);
                    if(!hashmiddle.add(hash(nline, ngoal))) continue;
                    list.add(new Pair(nline, ngoal));
                }
            }
        }
    }

    boolean impossible(int[] line, int idx, int dis){
        int target = line[idx] - dis;
        if(target<=0) return false;
        for(int i=0; i<n; i++) if(line[i]==target) return true;
        return false;
    }

    int[] move(int[] line, int idx, int dis){
        int[] nline = new int[n];
        for(int i=0; i<n; i++){
            nline[i] = line[i];
            if(i==idx) nline[i] = Math.max(0, nline[i] - dis);
        }
        return nline;
    }

    long goal(int[] line, int idx, long goal){
        long ngoal = goal;
        if(line[idx]<=0){
                if(ngoal<=0) ngoal = idx+1;
                else ngoal = ngoal * 10 + (idx+1);
        }
        return ngoal;
    }

    long hash(int[] line, long goal){
        long res = allGoal*10 + goal;
        for(int i=0; i<n; i++){
            res*=10;
            res+=line[i];
        }
        return res;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}