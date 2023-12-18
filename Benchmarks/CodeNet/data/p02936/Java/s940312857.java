
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		List<Node> nodes = new ArrayList<Node>();
		for(int i=0;i<N;i++) {
			nodes.add(new Node());
		}
		for(int i=0;i<N-1;i++) {
			nodes.get(sc.nextInt()-1).getUnders().add(nodes.get(sc.nextInt()-1));
		}
		for(int i=0;i<Q;i++) {
			addCntLoop(nodes.get(sc.nextInt()-1), sc.nextInt());
		}
		StringBuilder sb = new StringBuilder();
		for(Node tmp:nodes) {
			sb.append(tmp.getCnt());
			sb.append(" ");
		}
		System.out.println(sb.toString());
		
	}
	static void addCntLoop(Node n, int p) {
		n.addCnt(p);
		List<Node> unders = n.getUnders();
		for(Node tmp:unders) {
			addCntLoop(tmp, p);
		}
	}
}

class Node{
	private List<Node> unders = new ArrayList<Node>();
	private int cnt=0;
	
	public void addCnt(int p) {
		this.cnt+=p;
	}
	
	//g&&s
	public List<Node> getUnders() {
		return unders;
	}
	public void setUnders(List<Node> unders) {
		this.unders = unders;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}