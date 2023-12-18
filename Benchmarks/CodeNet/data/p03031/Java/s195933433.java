import java.util.*;
 
public class Main {
    static int c;
    static ArrayList<ArrayList<Integer>> l;
    static int[] ps;
    static int N;
    static int M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        l = new ArrayList<>();
        for(int i = 0; i<M; i++){
            ArrayList<Integer> ll = new ArrayList<>();
            int k = sc.nextInt();
            for(int j = 0; j<k; j++)ll.add(sc.nextInt()-1);
            l.add(ll);
        }
        ps = new int[M];
        for(int i = 0; i<M; i++) ps[i] = sc.nextInt();
        sc.close();
        int[] switches = new int[N];
        dfs(0,switches);
        System.out.println(c);
    }
    static void dfs(int i, int[] s){
        if(i==N){
            if(func(s)) c++;
            return;
        }
        dfs(++i,s);
        s[--i] = 1;
        dfs(++i,s);
        s[--i] = 0;
    }
    static boolean func(int[] s){
        int acs = 0;
        for(int i = 0; i<M; i++){
            ArrayList<Integer> ll = l.get(i);
            int cnt = 0;
            for(int j = 0; j<ll.size(); j++){
                if(s[ll.get(j)]==1) cnt++;
            }
            if(cnt%2 == ps[i]) acs++;
        }
        if(acs == M) return true;
        return false;
    }
}