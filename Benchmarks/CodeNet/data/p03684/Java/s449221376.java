import java.io.*;
import java.util.*;

class Main{
	public static void setInput(Map<Integer,Set<Integer>> _map, int _val, int _town) {
		if(!_map.containsKey(_val)) {
			Set<Integer> _hs = new HashSet<>();
			_hs.add(_town);
			_map.put(_val,_hs);
		}else {
			_map.get(_val).add(_town);
		}
	}

	public static void setNexttoQueue(Queue<MySet> pq, Map<Integer,Set<Integer>> _map, boolean isTate) {
		int _pre = -1;
		for(Map.Entry<Integer,Set<Integer>> e : _map.entrySet()) {
			int key = e.getKey();
			if(_pre==-1) {
				_pre = key;
			}else {
				pq.add(new MySet(isTate,key,key-_pre));
				_pre = key;
			}
		}
	}

	public static void addNocostBranches(Queue<Branch> breanches, Map<Integer,Set<Integer>> _map) {
		for(Map.Entry<Integer,Set<Integer>> e : _map.entrySet()) {
			Set<Integer> set = e.getValue();
			int preTownNum = -1;
			for(int townNum : set) {
				if(preTownNum!=-1) {
					breanches.add(new Branch(townNum,preTownNum,0));
				}
				preTownNum = townNum;
			}
		}
	}

	public static void addNexttoRowBranches(Queue<Branch> branches, Queue<MySet> pq, Map<Integer,Set<Integer>> tate, Map<Integer,Set<Integer>> yoko) {
		while(!pq.isEmpty()) {
			MySet ms = pq.poll();
			Map<Integer,Set<Integer>> _map = null;
			if(ms.isTate) {
				_map = tate;
			}else{
				_map = yoko;
			}

			//System.out.println(ms.isTate+","+ms.index+","+(ms.index-ms.value));

			Set<Integer> set1 = _map.get(ms.index);
			Set<Integer> set2 = _map.get(ms.index-ms.value);
			int townNum1 = -1;
			int townNum2 = -1;
			for(int i : set1) {
				townNum1 = i;
				break;
			}
			for(int i : set2) {
				townNum2 = i;
				break;
			}

			branches.add(new Branch(townNum1,townNum2,ms.value));
		}
	}

	public static int calcMinAllareaTree(Node[] townGroup, Queue<Branch> branches) {
		int result = 0;
		while(!branches.isEmpty()) {
			/*
			for(int i = 0; i < townGroup.length; i++) {
				System.out.print(townGroup[i].getParent().toString().substring(5,10)+",");
			}
			*/
			//System.out.println();
			Branch branch = branches.poll();
			Node group1 = townGroup[branch.n1].getParent();
			Node group2 = townGroup[branch.n2].getParent();
			//System.out.println(branch.n1+","+branch.n2+","+branch.value);
			if(group1!=group2) {
				//System.out.println(branch.value);
				result += branch.value;
				Node newParent = new Node();
				group1.parent = newParent;
				group2.parent = newParent;
			}
		}
		return result;
	}


	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Map<Integer,Set<Integer>> tate = new TreeMap<>(), yoko = new TreeMap<>();
		for(int i = 0; i < n; i++) {
			String[] _input = reader.readLine().split(" ");
			int _x = Integer.parseInt(_input[0]);
			int _y = Integer.parseInt(_input[1]);
			setInput(tate,_x,i);
			setInput(yoko,_y,i);
		}
/*
			for(Map.Entry e : tate.entrySet()) System.out.println(e.getKey()+" , "+e.getValue());
			for(Map.Entry e : yoko.entrySet()) System.out.println(e.getKey()+" , "+e.getValue());
*/

		Queue<MySet> pq = new PriorityQueue<>();

		setNexttoQueue(pq, tate, true);
		setNexttoQueue(pq, yoko, false);

		Queue<Branch> branches = new PriorityQueue<>();
		addNocostBranches(branches,tate);
		addNocostBranches(branches,yoko);
		addNexttoRowBranches(branches,pq,tate,yoko);

		Node[] townGroup = new Node[n];
		for(int i = 0; i < n; i++) townGroup[i] = new Node();
		int result = calcMinAllareaTree(townGroup, branches);

		System.out.println(result);
	}
}

class MySet implements Comparable{
	boolean isTate;
	int index;
	int value;

	public MySet(boolean _isTate, int _index, int _value) {
		isTate = _isTate;
		index = _index;
		value = _value;
	}

	@Override
	public int compareTo(Object _o) {
		return this.value - ((MySet)_o).value;
	}
}

class Branch implements Comparable{
	int n1,n2;
	int value;

	public Branch(int _n1, int _n2, int _value) {
		n1 = _n1;
		n2 = _n2;
		value = _value;
	}

	@Override
	public int compareTo(Object _o) {
		return this.value - ((Branch)_o).value;
	}
}

class Node{
	Node parent = null;

	public Node() {
	}

	public Node(Node _parent) {
		parent = _parent;
	}

	public Node getParent() {
		if(parent==null) return this;
		else {
			Node newParent = parent.getParent();
			parent = newParent;
			return newParent;
		}
	}
}
