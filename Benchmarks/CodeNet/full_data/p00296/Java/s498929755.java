import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		myRoopList ls=new myRoopList();

		int n=in.nextInt(),r=in.nextInt(),q=in.nextInt();

		for(int i=0;i<n;i++)ls.add(i);
		ls.build();
		//ls.dump();

		for(int i=0;i<r;i++) {
			int a=Integer.parseInt(in.next());
			if(a%2==0) {
				for(int j=0;j<a;j++)ls.next();
			}
			else {
				for(int j=0;j<a;j++)ls.prev();
			}
			ls.remove();
			//ls.dump();
		}
		
		for(int i=0;i<q;i++) {
			System.out.println((ls.contains(Integer.parseInt(in.next()))? 1:0));
		}

	}

}

class node{
	int id;
	node prev,next;
	node(int v){
		id=v;
	}
}

class myRoopList{
	node EDG,NOW;
	int size=0,p=0;

	myRoopList(){
		EDG=new node(-1);
		EDG.prev=EDG;
		EDG.next=EDG;
	}

	void add(int v) {
		node NEW=new node(v);

		NEW.next=EDG;
		NEW.prev=EDG.prev;

		if(size==0)EDG.next=NEW;
		EDG.prev.next=NEW;
		EDG.prev=NEW;
		size++;
	}

	void build() {
		EDG.prev.next=EDG.next;
		EDG.next.prev=EDG.prev;
		NOW=EDG.next;
	}

	void next() {
		NOW=NOW.next;
	}

	void prev() {
		NOW=NOW.prev;
	}
	
	boolean contains(int v) {
		node now=EDG.next;
		int i=0;
		while(i<size) {
			if(now.id==v)return true;
			now=now.next;
			i++;
		}
		return false;
	}

	void remove() {
		NOW.prev.next=NOW.next;
		NOW.next.prev=NOW.prev;
		if(NOW==EDG.next)EDG.next=NOW.next;
		if(NOW==EDG.prev)EDG.prev=NOW.prev;
		NOW=NOW.next;
	
		size--;
	}

	void dump() {
		node now=EDG.next;
		System.out.print("[");
		int i=0;
		while(i<size) {
			System.out.print(" "+now.id);
			now=now.next;
			i++;
		}
		System.out.println("]");
	}
}
