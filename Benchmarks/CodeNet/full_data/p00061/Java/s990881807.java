import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> points;
    String[] s;
    Integer[] pp;
    HashMap<Integer, Integer> t;
    int n, p;

    void run(){
	t = new HashMap<Integer, Integer>();
	points = new ArrayList<Integer>();
	while(sc.hasNext()){
	    s = sc.next().split(",");
	    n = Integer.parseInt(s[0]);
	    p = Integer.parseInt(s[1]);
	    if(!(n==0 && p==0)){
		t.put(n, p);
		if(!points.contains(p))
		    points.add(p);
	    }
	    else{
		pp = new Integer[points.size()];
		points.toArray(pp);
		Arrays.sort(pp);
		solve();
	    }
	}
    }

    void solve(){
	while(sc.hasNext()){
	    int x = sc.nextInt();
	    int y = t.get(x);

	    int ans=0;
	    while(pp[ans]!=y) ans++;

	    System.out.println(pp.length - ans);
	}
    }
}