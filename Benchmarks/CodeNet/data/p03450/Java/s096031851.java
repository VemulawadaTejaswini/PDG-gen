import java.util.*;

class Main{
    private static int N;
    private static int M;
    private static boolean[] record;
    private static HashMap<Integer,Integer>[] map;
    private static int[] coordinate;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        record = new boolean[N+1];
        coordinate = new int[N+1];
        int[] L = new int[M];
        int[] R = new int[M];
        int[] D = new int[M];
        for(int i=0;i<M;i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            D[i] = sc.nextInt();
        }
        map = new HashMap[N+1];
        for(int i=0;i<=N;i++) map[i] = new HashMap<>();
        for(int i=0;i<M;i++){
            map[L[i]].put(R[i],D[i]);
            map[R[i]].put(L[i],-D[i]);
        }
        for(int i=1;i<=N;i++){
            if(!record[i]){
                boolean flag = dfs(i,0);
                if(!flag){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
    private static boolean dfs(int i, int pos){
        if(record[i]){
            return pos == coordinate[i];
        }
        record[i] = true;
        coordinate[i] = pos;
        for(Integer w:map[i].keySet()){
            if(!dfs(w,pos+map[i].get(w))) return false;
        }
        return true;
    }
}