import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		Splice S = new Splice(n);
		for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			int op = Integer.parseInt(str[0]);
			if(op == 0){
				int t = Integer.parseInt(str[1]);
				int x = Integer.parseInt(str[2]);
				S.insert(t, x);
			}else if(op == 1){
				int t = Integer.parseInt(str[1]);
				S.dump(t);
			}else{
				int s = Integer.parseInt(str[1]);
				int t = Integer.parseInt(str[2]);
				S.splice(s, t);
			}
		}
	}
}

class Splice{
	private class Node{
		int val;
		Node next = null;
	}
	private Node[] front;
	private Node[] rear;
	Splice(int n){
		front = new Node[n];
		rear = new Node[n];
	}
	public void insert(int t, int x){
		if(front[t] == null){
			front[t] = new Node();
			front[t].val = x;
			rear[t] = front[t];
			return;
		}
		rear[t].next = new Node();
		rear[t].next.val = x;
		rear[t] = rear[t].next;
	}
	public void dump(int t){
		if(front[t] == null){
			System.out.print("\n");
			return;
		}
		Node now = front[t];
		for(;;){
			System.out.print(now.val);
			if(now.next == null){
				System.out.print("\n");
				return;
			}
			System.out.print(" ");
			now = now.next;
		}
	}
	public void splice(int s, int t){
		if(front[t] == null){
			front[t] = front[s];
			rear[t] = rear[s];
		}else{
			rear[t].next = front[s];
			rear[t] = rear[s];
		}
		rear[s] = null;
		front[s] = null;
	}
}

