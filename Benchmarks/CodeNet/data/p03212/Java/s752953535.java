import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        ArrayList<Long> list = new ArrayList<>();
        dfs(list,0);
        Iterator<Long> itr = list.iterator();
        while(itr.hasNext()){
            String s = itr.next().toString();
            if(!(s.contains("3")&&s.contains("5")&&s.contains("7"))){
                itr.remove();
            }
        }
            System.out.println(list.size());        
    }
    void dfs(ArrayList<Long> list,long x){
        if(x<=n){
            list.add(x);
        }else{
            return;
        }
        dfs(list,x*10+3);
        dfs(list,x*10+5);
        dfs(list,x*10+7);
    }
}
