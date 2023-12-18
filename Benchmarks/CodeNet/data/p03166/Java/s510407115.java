import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer,ArrayList<Integer>> Edge = new HashMap<>();
        int DP [] = new int[N];
        Arrays.fill(DP,0);
        int opt [] = new int[N];
        int opt_num = 0;
        Queue<Integer> L = new ArrayDeque<>();
        for(int i=0;i<M;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(Edge.get(x)==null){
                ArrayList<Integer> E = new ArrayList<>();
                E.add(y);
                Edge.put(x,E);
            }
            else Edge.get(x).add(y);
        }
        //トポロジカルソート
        for(int i=1;i<N+1;i++){
            boolean check = true;
            for(int j=1;j<N+1;j++) {
                if(Edge.get(j)!=null&&Edge.get(j).contains(i)){
                    check = false;
                    break;
                }
            }
            if(check)L.add(i);
        }
        DP[0]=0;
        while(L.size()!=0) {
            int num = L.poll();
            opt[opt_num] = num;
            for(int i=0;i<opt_num;i++) if(Edge.get(opt[i])!=null&&Edge.get(opt[i]).contains(-num)) DP[opt_num] = Math.max(DP[opt_num],DP[i]+1);
            opt_num++;
            for (int i = 1; i < N + 1; i++) {
                if (Edge.get(num)!=null&&Edge.get(num).contains(i)){
                    Edge.get(num).remove(Edge.get(num).indexOf(i));
                    Edge.get(num).add(-i);
                    boolean check = true;
                    for (int j = 1; j < N + 1; j++) {
                        if (Edge.get(j)!=null&&Edge.get(j).contains(i)) {
                            check = false;
                            break;
                        }
                    }
                    if (check) L.add(i);
                }
            }
        }
        System.out.println(DP[N-1]);
    }
}