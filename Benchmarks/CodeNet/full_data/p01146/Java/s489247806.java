import java.util.*;

public class Main{
    int n,m,l,k,a,h;
    int[] x,y,t;
    int[][] time;
    int min;
    List<String> f;

    public static void main(String[] args){
	new Main2().solve();
    }

    void solve(){
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	while(n!=0){
	    m = sc.nextInt();
	    l = sc.nextInt();
	    k = sc.nextInt();
	    a = sc.nextInt();
	    h = sc.nextInt();
	    f = new ArrayList<String>();
	    if(l>0){
		for(int i=0; i<l; i++){
		    f.add(sc.nextInt()+"");
		}
		f.add(a+"");
		f.add(h+"");
	    }
	    x = new int[k];
	    y = new int[k];
	    t = new int[k];
	    time = new int[n][n];
	    for(int i=0; i<n; i++){Arrays.fill(time[i],-1);}
	    for(int i=0; i<k; i++){
		x[i] = sc.nextInt();
		y[i] = sc.nextInt();
		t[i] = sc.nextInt();
		if(t[i]<=m){
		    time[y[i]][x[i]] = t[i];
		    time[x[i]][y[i]] = t[i];
		}
	    }

	    min = Integer.MAX_VALUE;
	    dfs(a,m,0,0,new boolean[n][n]);

	    if(min==Integer.MAX_VALUE){
		System.out.println("Help!");
	    }else{
		System.out.println(min);
	    }

	    n = sc.nextInt();
	}
    }

    void dfs(int pos, int left, int freeze, int dist, boolean[][] used){
	//System.out.println("pos:"+pos+" left:"+left+" freeze: "+freeze+" dist:"+dist);
	if(pos==h){
	    freeze -= left;
	    min = Math.min(min,dist+freeze);
	    return;
	}

	//used[pos] = true;

	if(f.contains(pos+"")){
	    freeze += m-left;
	    left = m;
	}

	for(int i=0; i<n; i++){
	    if(i==pos)continue;
	    //System.out.println("pos:"+pos+" i:"+i+" time[i][pos]:"+time[i][pos]+" used[i]:"+used[i]+" left-time[i][pos]:"+(left-time[i][pos]));
	    if(time[i][pos]>=0 && !used[pos][i] && left-time[i][pos]>=0){
		used[pos][i] = true;
		dfs(i,left-time[i][pos],freeze,dist+time[i][pos],used);
		used[pos][i] = false;
	    }
	}

	//used[pos] = false;
    }
}