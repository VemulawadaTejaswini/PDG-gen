import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

	static int N;
	static int M;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		N = Integer.parseInt(tmp[0]);
		M = Integer.parseInt(tmp[1]);

		ArrayList<Edge> e = new ArrayList<Edge>();

		for(int i = 0;i<M;i++){
			tmp = br.readLine().split(" ");
			Edge edge = new Edge(Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1]));
			e.add(edge);
		}

		//1個ずつ辺を消して、橋か確かめる
		int bridge = 0;
		for(int i = 0;i<M;i++){
			ArrayList<Edge> nowBridge = new ArrayList<Edge>(e);
			nowBridge.remove(i);

			if(!ping(nowBridge))bridge++;
		}

		System.out.println(bridge);

	}

	public static boolean ping(ArrayList<Edge> l){
		//全てのノードに到達可能か調べる

		//こいつらにはノード番号が入る
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> done = new ArrayList<Integer>();

		//ここに最初のノードで到達できるノードを代入
		int nowNodeID = 1;

		for(int i = 0;i < getArrive(nowNodeID,l).size();i++){
			stack.push(getArrive(nowNodeID,l).get(i));
		}

		while(!stack.isEmpty()){
			nowNodeID = stack.pop();

			for(int i = 0;i < getArrive(nowNodeID,l).size();i++){
				int pushID = getArrive(nowNodeID,l).get(i);
				if(stack.search(pushID) == -1 && !done.contains(pushID)){
					stack.push(pushID);
				}
			}
			done.add(nowNodeID);
		}

//		done.sort(null);
//
//		for(int i = 1;i<=N;i++){
//			if(done.get(i) != i)return false;
//		}

		if(done.size() == N)return true;
		else return false;
	}

	public static ArrayList<Integer> getArrive(int nodeID,ArrayList<Edge> l){
		//iノードから到達可能なノードをListで返す
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0;i<l.size();i++){
			if(l.get(i).a == nodeID){
				ret.add(l.get(i).b);
			}else if(l.get(i).b == nodeID){
				ret.add(l.get(i).a);
			}
		}

		return ret;
	}

	public static class Edge{
		int a;
		int b;

		Edge(int x,int y){
			a = x;
			b = y;
		}
	}
}
