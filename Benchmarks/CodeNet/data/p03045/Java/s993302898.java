import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Graph g=new Graph();
        for(int i=0;i<a;i++){
            g.add(i+1+"");
        }
        int b=sc.nextInt();
        for(int i=0;i<b;i++){
            g.add(sc.nextInt()+"",sc.nextInt()+"");
            sc.next();
        }
        System.out.println(g.connectedCompo());
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

	//a→bの片方向
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

	//出力関数
	public void print() {
		for (String key : edge.keySet()) {
			System.out.println(key + ":" + edge.get(key));
		}
	}

	//幅優先探索
	public boolean isConnect(String a, String b) {
		if (!vertex.containsKey(a) || !vertex.containsKey(b))
			return false;
		Map<String, Boolean> check = new HashMap<String, Boolean>();
		ArrayList<String> queue = new ArrayList<>();
		check.put(a, false);
		queue.add(a);
		while (!check.containsKey(b) && queue.size() != 0) {
			ArrayList<String> cont = new ArrayList<>(edge.get(queue.get(0)));
			queue.remove(0);
			//System.out.println(cont);
			for (int i = 0; i < cont.size(); i++) {
				if (!check.containsKey(cont.get(i))) {
					queue.add(cont.get(i));
					check.put(cont.get(i), false);
				}
			}
		}
		return check.containsKey(b);
	}

	//幅優先探索(深さ上限付き)
	public boolean isConnect(String a, String b, int n) {
		if (!vertex.containsKey(a) || !vertex.containsKey(b))
			return false;
		Map<String, Boolean> check = new HashMap<String, Boolean>();
		ArrayList<String> queue = new ArrayList<>();
		check.put(a, false);
		queue.add(a);
		queue.add("xxkiritoxx");
		int depth = 1;
		int count=0;
		while (!check.containsKey(b) && queue.size() != 0 && depth <= n) {
		    
			if (queue.get(count).equals("xxkiritoxx")) {
				depth++;
				count++;
				if (queue.size() != 0)
					queue.add("xxkiritoxx");
			} else {
				ArrayList<String> cont = new ArrayList<>(edge.get(queue.get(0)));
				count++;
				//System.out.println(cont);
				for (int i = 0; i < cont.size(); i++) {
					if (!check.containsKey(cont.get(i))) {
						queue.add(cont.get(i));
						check.put(cont.get(i), false);
					}
				}
			}
		}
		return check.containsKey(b);
	}

	//幅優先探索(深さ)
	public int depth(String a, String b) {
		if (!vertex.containsKey(a) || !vertex.containsKey(b))
			return -1;
		Map<String, Boolean> check = new HashMap<String, Boolean>();
		ArrayList<String> queue = new ArrayList<>();
		check.put(a, false);

		queue.add(a);
		queue.add("xxkiritoxx");
		int depth = 1;
		int count=0;
		while (!check.containsKey(b) && queue.size() != 0) {
			//System.out.println(queue.get(0));
			if (queue.get(count).equals("xxkiritoxx")) {
				depth++;
				count++;
				if (queue.size() != 0)
					queue.add("xxkiritoxx");
			} else {
				ArrayList<String> cont = new ArrayList<>(edge.get(queue.get(0)));
				count++;
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

	//連結成分の数
	public int connectedCompo() {
		Map<String, Integer> copyV = new HashMap<>(vertex);
		int count = 0;
		while (copyV.size() != 0) {
			count++;
			String a = "";
			for (String key : copyV.keySet()) {
				a = key;
				break;
			}
			copyV.remove(a);
			ArrayList<String> queue = new ArrayList<>();
			queue.add(a);
			Map<String, Boolean> check = new HashMap<String, Boolean>();
			check.put(a, false);
			while (queue.size() != 0) {
				ArrayList<String> cont = edge.get(queue.get(0));
				queue.remove(0);
				for (int i = 0; i < cont.size(); i++) {
					if (!check.containsKey(cont.get(i))) {
						copyV.remove(cont.get(i));
						queue.add(cont.get(i));
						check.put(cont.get(i), false);
					}
				}
			}
		}
		return count;
	}
	//下のコンパレーター
	public static boolean inchwormCompare(int value,int k){
        return (value<=k);
    }
	//尺取り(maxは閾値以下のint隊列の連続した部分の個数を表す)
	public static int inchworm(int[] a,int k){
        int max=0;
        int value=0;
        int j=0;
        for(int i=0;i<a.length;i++){
            value+=a[i];
            if(value>k)
                while(!inchwormCompare(value,k)){
                    value-=a[j];
                    j++;
                    if(i<j)break;
                }
            max+=(i-j+1);
        }
        return max;
    }
	public static int arrayMax(int[]n) {
		int max=n[0];
		for(int i=1;i<n.length;i++)max=Math.max(max,n[i]);
		return max;
	}

}