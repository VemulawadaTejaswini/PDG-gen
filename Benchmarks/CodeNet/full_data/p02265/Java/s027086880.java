import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m;
		
		LinkedList list = new LinkedList();
		
		for(int i = 0; i < n; i++){
			String[] meirei = br.readLine().split(" ");
			
			if(meirei[0].equals("deleteFirst")){
				list.removeFirst();
			}else if(meirei[0].equals("deleteLast")){
				list.removeLast();
			}else if(meirei[0].equals("insert") || meirei[0].equals("delete")){
				m = Integer.parseInt(meirei[1]);
				if(meirei[0].equals("insert")){
					list.insert(m);
				}else{
					list.remove(m);
				}
			}
		}
		System.out.println(list.toString());
	}
}

class Room{
	Room prev; //????????¨?±????????????????
	Room next; //?¬??????¨?±????????????????
	int data; //??¨?±?????????????
	
	public Room(int data){
		this.data = data;
		prev = null;
		next = null;
	}

}

class LinkedList {
	Room head;
	Room leg;
	
	public LinkedList(){
		head = new Room(0);
		head.next = head;
		head.prev = head;
		leg = head;
	}
	
	//??¨?±?x?????´??????data????????\
	void insert(int data){
		Room x = new Room(data);
		x.prev = head;
		x.next = head.next;
		head.next.prev = x;
		head.next = x;
		leg = head.prev;
	}
	
	public void removeFirst(){
		Room x = head.next;
		head.next.prev = x.prev;
		x.prev.next = x.next;
		leg = head.prev;
	}
	
	public void removeLast(){
		leg.next.prev = leg.prev;
		leg.prev.next = leg.next;
		leg = head.prev;
	}
	
	public void remove(int num){
		Room p = head.next;
		while(p != head){
			if(p.data == num){
				p.prev.next = p.next;
				p.next.prev = p.prev;
				break;
			}
			p = p.next;
		}
		leg = head.prev;
	}

	public String toString(){
		StringBuilder st = new StringBuilder();
		for(Room p=head.next; p != head; p = p.next){
			if(p.next != head){
				st.append(p.data + " ");
			}else{
				st.append(p.data);
			}
		}
		return st.toString();
	}
}  