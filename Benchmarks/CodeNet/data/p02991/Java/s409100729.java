import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        newGraph g=new newGraph();
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                g.add(i+1+","+j);
        for(int i=0;i<m;i++){
            int v=sc.nextInt();
            int u=sc.nextInt();
            g.add(v+",0");
            g.add(v+",1");
            g.add(v+",2");
            g.add(u+",0");
            g.add(u+",1");
            g.add(u+",2");
            g.unadd(v+",0",u+",1");
            g.unadd(v+",1",u+",2");
            g.unadd(v+",2",u+",0");
        }
        int ans=g.depth(sc.nextInt()+",0",sc.nextInt()+",0");
        System.out.println((ans==-1)?-1:ans/3);
	}
}
class newGraph {
	Map<String, ArrayList<String>> edge;
	Map<String, Integer> vertex;

	public newGraph() {
		edge = new HashMap<String, ArrayList<String>>();
		vertex = new HashMap<String, Integer>();
	}

	public void add(String a) {
		if (!edge.containsKey(a)) {
			ArrayList<String> cont = new ArrayList<>();
			edge.put(a, cont);
			vertex.put(a, 1);
		}
	}


	public void unadd(String a, String b) {
		if (edge.containsKey(a)) {
			edge.get(a).add(b);
			vertex.put(a, vertex.get(a) + 1);
		} else {
			ArrayList<String> cont = new ArrayList<>();
			cont.add(b);
			edge.put(a, cont);
			vertex.put(a, 1);
		}
		if (!edge.containsKey(b)) {
			ArrayList<String> cont = new ArrayList<>();
			edge.put(b, cont);
		}
	}

	public int depth(String a, String b) {
		if (!vertex.containsKey(a) || !vertex.containsKey(b))
			return -1;
		Map<String, Boolean> check = new HashMap<String, Boolean>();
		Queue<String> queue = new ArrayDeque<>();
		check.put(a, false);

		queue.add(a);
		queue.add("xxkiritoxx");
		int depth = 1;
		while (!check.containsKey(b) && queue.size() != 0) {
			//System.out.println(queue.get(0));

			String quevalue=queue.poll();
			if (quevalue.equals("xxkiritoxx")) {
				depth++;
				if (queue.size() != 0)
					queue.add("xxkiritoxx");
			} else {
				ArrayList<String> cont = new ArrayList<>(edge.get(quevalue));
				//System.out.println(cont);
				for (int i = 0; i < cont.size(); i++) {
					if (!check.containsKey(cont.get(i))) {
						queue.add(cont.get(i));
						check.put(cont.get(i), false);
					}
				}
			}
		}
		return check.containsKey(b) ? depth : -1;
	}

}