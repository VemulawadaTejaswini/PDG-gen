import java.util.*;

class Main{

    int n;
    int[] kura, shiro, sen;
    int[] via;
    int goal;

    void solve(){
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();

	if(n==0){
	    return;
	}

	kura = new int[n];
	shiro = new int[n];
	sen = new int[n];
	for(int i=0; i<n; i++){
	    kura[i] = sc.nextInt();
	    shiro[i] = sc.nextInt();
	    sen[i] = sc.nextInt();
	}
	via = new int[n];

	int[] ansVia = new int[n];
	double min = Double.MAX_VALUE;
	int ansGoal = -1;
	for(int i=0; i<n; i++){
	    Arrays.fill(via, -1);
	    double res = dijkstra(i);
	    if(min>res){
		min = res;
		ansGoal = goal;
		for(int j=0; j<n; j++){
		    ansVia[j] = via[j];
		}
	    }
	}

	ArrayList<Integer> list = new ArrayList<Integer>();

	list.add(new Integer(kura[ansGoal]));
	while(ansVia[ansGoal]!=-1){
	    list.add(new Integer(kura[ansVia[ansGoal]]));
	    ansGoal = ansVia[ansGoal];
	}

	for(int i=list.size()-1; i>0; i--){
	    System.out.print(list.get(i)+" ");
	}
	System.out.println(list.get(0));
    }

    class P{
	int pos, before, weight, bit;
	double time;
	P(int pos, int before, double time, int weight, int bit){
	    this.pos = pos;
	    this.before = before;
	    this.time = time;
	    this.weight = weight;
	    this.bit = bit;
	}
    }

    double dijkstra(int st){
	//pos, time, weight, bit
	PriorityQueue<P> 
	    q = new PriorityQueue<P>(10, new Comparator<P>(){
		    public int compare(P a, P b){
			if(a.time<b.time) return -1;
			else if(a.time>b.time) return 1;
			else return 0;
		    }
		});
	q.add(new P(st, -1, 0.0, sen[st]*20, 1<<st));

	while(q.size()>0){
	    P qq = q.poll();
	    int pos = qq.pos,  before = qq.before, weight = qq.weight, bit = qq.bit;
	    double time = qq.time;

	    if(before!=-1){
		via[pos] = before;
	    }

	    if(bit==(1<<n)-1){
		goal = pos;
		return time;
	    }

	    for(int i=0; i<n; i++){
		if((bit & (1<<i)) > 0) continue;
		else{
		    double newT = (double)(time + Math.abs(shiro[i] - shiro[pos])) / (2000/(70+weight));
		    int newW = weight + sen[i] * 20;
		    q.add(new P(i, pos, newT, newW, bit^(1<<i)));
		}
	    }
	}

	goal = -1;
	return Double.MAX_VALUE;
    }

    public static void main(String[] args){
	new Main().solve();
    }
}