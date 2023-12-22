import java.io.*;
class Node{
	Node(int v,Node prev,Node next){
		this.v=v;
		this.prev=prev;
		this.next=next;
	}
	public int v;
	public Node prev, next;
}
class DLList{
	DLList(){
		o=new Node(0,null,null);
		o.next=o;
		o.prev=o;
	}
	public void ins(int x){
		Node t=new Node(x,o,o.next);
		o.next.prev=t;
		o.next=t;
	}
	public Node d(Node n){
		n.prev.next=n.next;
		n.next.prev=n.prev;
		return n.next;
	}
	public void del(int x){
		Node n=o.next;
		while(n!=o){
			if(n.v==x){
			    n=d(n);
			    continue;
			}
			n=n.next;
		}
	}
	public void delF(){
		d(o.next);
	}
	public void delL(){
		d(o.prev);
	}
	public void print(){
		for(Node n=o.next;n!=o;n=n.next){
			System.out.print(n.v+(n.next!=o?" ":"\n"));
		}
	}
	public Node o;
}
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(
			new InputStreamReader(System.in));
		DLList ll=new DLList();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			String l[];
			l=br.readLine().split(" ");
			switch(l[0]){
				case "insert":ll.ins(Integer.parseInt(l[1]));break;
				case "delete":ll.del(Integer.parseInt(l[1]));break;
				case "deleteFirst":ll.delF();break;
				case "deleteLast":ll.delL();break;
			}
			
		}
		ll.print();
	}
}