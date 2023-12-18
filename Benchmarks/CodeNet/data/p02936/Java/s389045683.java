import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[]depth=new int[n+1];
        long val[]=new long[n+1];
        Graph g=new Graph();
        for(int i=0;i<n;i++){
            g.add(i+1+"");
        }
        for(int i=0;i<n-1;i++){
            g.add(sc.next(),sc.next());
        }
        for(int i=0;i<q;i++){
            val[sc.nextInt()]+=sc.nextInt();
        }
        String[]oya=g.popopo(n);
        System.out.print(val[1]);
        for(int i=2;i<=n;i++){
            long an=0;
            String poll=i+"";
            while(!poll.equals("0")){
                an+=val[Integer.parseInt(poll)];
                poll=oya[Integer.parseInt(poll)];
            }
            System.out.print(" "+an);
        }
    }
}
class Graph {
	Map<String, ArrayList<String>> edge;
	Map<String, Integer> vertex;
	public Graph() {
		//点,<辺が伸びている先>
		edge = new HashMap<String, ArrayList<String>>();
		//点,点の次数
		vertex = new HashMap<String, Integer>();
	}

	//点の追加
	public void add(String a) {
		if (!edge.containsKey(a)) {
			ArrayList<String> cont = new ArrayList<>();
			edge.put(a, cont);
			vertex.put(a, 1);
		}
	}

	//双方向点の追加
	public void add(String a, String b) {
		add(a);

		add(b);
		if (edge.containsKey(a)) {
			edge.get(a).add(b);
			vertex.put(a, vertex.get(a) + 1);
		} else {
			ArrayList<String> cont = new ArrayList<>();
			cont.add(b);
			edge.put(a, cont);
			vertex.put(a, 1);
		}
		if (edge.containsKey(b)) {
			edge.get(b).add(a);
			vertex.put(b, vertex.get(b) + 1);
		} else {
			ArrayList<String> cont = new ArrayList<>();
			cont.add(a);
			edge.put(b, cont);
			vertex.put(b, 1);
		}
	}


	//出力関数
	public void print() {
		for (String key : edge.keySet()) {
			System.out.println(key + ":" + edge.get(key));
		}
	}
	public String[] popopo(int n){
	    String ans[]=new String[n+1];
	    Map<String, Boolean> check = new HashMap<String, Boolean>();
		Queue<String> queue = new ArrayDeque<>();
		check.put("1", false);
        ans[1]="0";
		queue.add("1");
		while (queue.size() != 0) {
			String quevalue=queue.poll();
			ArrayList<String> cont = new ArrayList<>(edge.get(quevalue));
			//System.out.println(cont);
			for (int i = 0; i < cont.size(); i++) {
				if (!check.containsKey(cont.get(i))) {
				    ans[Integer.parseInt(cont.get(i))]=quevalue;
					queue.add(cont.get(i));
					check.put(cont.get(i), false);
				}
			}
		}
		return ans;
	}
	

}
