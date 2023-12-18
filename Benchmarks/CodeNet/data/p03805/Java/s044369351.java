import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer>[] el=new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            el[i]=new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            el[a].add(b);
            el[b].add(a);
        }
        int ans=0;
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        Queue<TreeSet<Integer>> keiro=new ArrayDeque<>();
        TreeSet<Integer> ts=new TreeSet<>();
        keiro.add(ts);
        while (!q.isEmpty()){
            int p=q.poll();
            TreeSet<Integer> temp=(TreeSet<Integer>) keiro.poll().clone();
            temp.add(p);
            if(temp.size()==n){
                ans++;
            }else {
                for (Integer k : el[p]) {
                    if (!temp.contains(k)) {
                        q.add(k);
                        keiro.add(temp);
                    }
                }
            }
        }
        out.println(ans);
    }
}