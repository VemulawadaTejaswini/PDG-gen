
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		myarray array=new myarray();
		int q=in.nextInt();
		for(int i=0;i<q;i++) {
			int query=Integer.parseInt(in.next());
			
			switch(query) {
			case 0:
				int d=Integer.parseInt(in.next()),
				x=Integer.parseInt(in.next());
				array.push(d, x);
				break;
				
			case 1:
				int p=Integer.parseInt(in.next());
				array.print(p);
				break;
				
			case 2:
				int d1=Integer.parseInt(in.next());
				array.pop(d1);
				break;
			}
		}
	}

}

class node{
	int x;
	node next,prev;
}

class myarray{
	node END,NOW;
	myarray(){
		END=new node();
		END.next=END;
		END.prev=END;
		NOW=END;
	}
	
	void push(int d,int x){
		node nn=new node();
		nn.x=x;
		if(d==0){
			nn.next=END.next;
			nn.prev=END;
			END.next.prev=nn;
			END.next=nn;
		}
		else{
			nn.next=END;
			nn.prev=END.prev;
			END.prev.next=nn;
			END.prev=nn;
		}
	}
	
	void pop(int d){
		if(d==0) {
			node NOW=END.next;
			NOW.prev.next=NOW.next;
			NOW.next.prev=NOW.prev;
		}else {
			node NOW=END.prev;
			NOW.prev.next=NOW.next;
			NOW.next.prev=NOW.prev;
		}
	}
	
	void print(int n) {
		NOW=END.next;
		for(int i=0;i<n;i++) {
			NOW=NOW.next;
		}
		System.out.println(NOW.x);
	}
}
