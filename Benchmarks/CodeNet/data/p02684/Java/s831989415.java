import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static long start=-1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long n = Long.parseLong(str[0]);
        long k = Long.parseLong(str[1]);
        List<Long> t = new ArrayList<Long>();
        t.add((long) 0);
        str = br.readLine().split(" ");
        for(int i=1; i<=n; ++i){
            t.add(Long.parseLong(str[i-1]));
        }
        boolean[] vis = new boolean[(int) (n+1)];
        dfs(1,vis,t);
        Set<Long> set = new LinkedHashSet<>();
        long curr = start;
        if(start != 1){
            curr =1;
            while(k >=0 && curr != start){
                curr = t.get((int)curr);
                k--;
            }
        }
        if(k < 0) {
            System.out.println(curr);
        }
        while(true){
            if(set.contains(curr)) break;
            set.add(curr);
            curr = t.get((int) curr);
        }
        if(set.size() == 1){
            System.out.println(curr);
        }

        k %= set.size();
        Iterator<Long> it = set.iterator();
        while(k >=0 && it.hasNext()){
            curr = it.next();
            k--;
        }
        System.out.println(curr);

    }
    public static boolean dfs(long curr, boolean[] vis, List<Long> t){
        if(vis[(int) curr]){
            start = curr;
            return true;
        }
        vis[(int) curr] = true;
        if(dfs(t.get((int) curr),vis,t)){
            return true;
        }
        return false;
    }
}
