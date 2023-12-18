
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	static BufferedReader reader;
	static int N;
	static Node[] nodes;
	static int turn = 0;
	static int takahashi_left = 0;
	static int takahashi_left_o = 0;
	static int takahashi_left_e = 0;
	//static field here
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] tmp = readLine();
		N = Integer.parseInt(tmp[0]);
		int u = Integer.parseInt(tmp[1])-1;
		int v = Integer.parseInt(tmp[2])-1;
		nodes = new Node[N];
		for(int i=0;i<N;i++) {
			nodes[i] = new Node(i);
		}
		for(int i=0;i<N-1;i++) {
			tmp = readLine();
			int A = Integer.parseInt(tmp[0])-1;
			int B = Integer.parseInt(tmp[1])-1;
			nodes[A].neighbor.add(nodes[B]);
			nodes[B].neighbor.add(nodes[A]);
		}
		
		nodes[u].tcheck();
		nodes[v].acheck();
		for(;((turn%2==0)?takahashi_left_o:takahashi_left_e)>0;) {
			turn++;
			//takahashi's turn
			for(Node n : nodes) {
				if(!n.checked()||n.by_aoki) {continue;}
				for(Node nn : n.neighbor) {
					if(!nn.checked()&&n.checked!=turn) {
						nn.tcheck();
					}
				}
			}
			if(((turn%2==0)?takahashi_left_o:takahashi_left_e)==0) {
				turn--;
				break;
			}
			//aoki's turn
			for(Node n : nodes) {
				if(!n.checked()||!n.by_aoki) {continue;}
				for(Node nn : n.neighbor) {
					if(n.checked==turn) {continue;}
					if(!nn.checked()) {
						nn.acheck();
					}else if(!nn.by_aoki) {
						nn.acheck();
					}
				}
			}
		}
		//String[] s = readLine();
		print(turn);
	}
	
	//functions here
	//note that all methods should be STATIC

	
	
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}

	static class Node{
		public int id;
		public ArrayList<Node> neighbor = new ArrayList<>();
		public int checked = -1;//-1(not checked) or >=0(checked turn)
		public boolean by_aoki = false;
		
		public Node(int id){
			// TODO 自動生成されたコンストラクター・スタブ
			this.id = id;
		}
		public void tcheck() {
			if(checked()) {throw new RuntimeException("can't check");}
			this.checked = turn;
			this.by_aoki = false;
			takahashi_left++;
			if(turn%2==0) {takahashi_left_o++;}
			else {takahashi_left_e++;}
		}
		public void acheck() {
			if(checked()&&this.by_aoki) {throw new RuntimeException("already checked");}
			if(checked()) {
				takahashi_left--;
				if(this.checked%2==0) {takahashi_left_o--;}
				else {takahashi_left_e--;}
			}
			this.checked = turn;
			this.by_aoki = true;
		}
		public boolean checked() {
			return checked!=-1;
		}
		public String toString() {
			if(checked()&&by_aoki)return "N"+id+"A"+checked;
			if(checked()&&!by_aoki)return "N"+id+"T"+checked;
			return "N"+id;
		}
	}
}
