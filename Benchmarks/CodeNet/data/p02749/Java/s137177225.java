import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    static int n;
    static ArrayList<Integer>[] g;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n-1; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            g[a].add(b);
            g[b].add(a);
        }
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addLast(0);
        int[] cnt = new int[2];
        int[] color = new int[n];
        Arrays.fill(color, -1);
        color[0] = 0;
        cnt[0]++;
        while(q.size()!=0){
            int now = q.removeLast();
            for(int next : g[now]){
                if(color[next] == -1){
                    q.addLast(next);
                    color[next] = color[now]^1;
                    cnt[color[next]]++;
                }
            }
        }
        
        StringJoiner sj = new StringJoiner(" ");
        int[] used = new int[3];
        if(cnt[0]<=n/3 || cnt[1]<=n/3){
            for(int i=0; i<n; i++){
                if(color[i] == (cnt[0]<cnt[1] ? 0:1)){
                    sj.add((used[2]+1)*3 + "");
                    used[2]++;
                }else{
                    for(int j=0; j<3; j++){
                        if(used[j]*3+j+1<=n){
                            sj.add(used[j]*3+j+1 + "");
                            used[j]++;
                            break;
                        }
                    }
                }
            }
        }else{
            for(int i=0; i<n; i++){
                if(used[color[i]]*3+color[i]+1<=n){
                    sj.add(used[color[i]]*3+color[i]+1 + "");
                    used[color[i]]++;
                }else{
                    sj.add((used[2]+1)*3 + "");
                    used[2]++;
                }
            }
        }
        
        System.out.println(sj.toString());
    }
}
