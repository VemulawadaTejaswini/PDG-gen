
import java.util.*;
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }
 
    public Main() {
        new AOJ0262().doIt();
    }
 
    class AOJ0262{
        int n,m;
        int[] masu;
        boolean visit[],visit2[],visit3[];
        int s,g;
        
        boolean dfs(int index){//スタート地点から行けるかどうか。
        	visit2[index] = true;
        	if(index==g)return true;
        	for(int i=1;i<=m;i++){
        		int next = i+index;
        		if(next<s)next = s;
        		if(next>g)next = g;
        		next+=masu[next];
        		if(next<s)next = s;
        		if(next>g)next = g;
        		if(visit2[next])continue;
        		if(dfs(next))return true;
        	}
        	return false;
        }
        
        void start(int index){//スタートする場所
//        	System.out.println(index);
        	visit[index] = true;
    		visit2 = new boolean[n+2];
        	visit3[index] = dfs(index);
        	for(int i=1;i<=m;i++){
        		int next = i+index;
        		if(next<s)next = s;
        		if(next>g)next = g;
        		next+=masu[next];
        		if(next<s)next = s;
        		if(next>g)next = g;
        		if(visit[next])continue;
        		start(next);
        	}
        }

        boolean solve(){
        	visit = new boolean[n+2];
        	visit3 = new boolean[n+2];
        	start(0);
        	for(int i=0;i<=n;i++)if(visit[i]&&!visit3[i])return false;//そのマスからstartしていてゴールしていない
        	return true;
        }
        
        
        
        void doIt(){
            while(true){
                m = in.nextInt();
                if(m==0)break;
                n = in.nextInt();
                masu = new int[n+2];
                for(int i=1;i<=n;i++)masu[i] = in.nextInt();
                s=0;g=n+1;
                System.out.println(solve()? "OK":"NG");
            }
        }
    }
 
}