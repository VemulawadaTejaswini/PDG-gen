//API???????????????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int[] x = new int[4];
		LinkedList list = new LinkedList();
		
		if(str1.length() < str2.length()){
			return;
		}else if(str1.indexOf(str2) == -1){
			return;
		}else if(str1.equals(str2)){
			System.out.println("0");
			return;
		}
		
		
		list.insert(str1.indexOf(str2));
		while(str1.indexOf(str2, list.getData() + 1) != -1){
			list.insert(str1.indexOf(str2, list.getData() + 1));
		}
		
		System.out.print(list.toString());
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
	
	public int getData(){
		Room p = head.next;
		return p.data;
	}

	public String toString(){
		StringBuilder st = new StringBuilder();
		for(Room p=head.prev; p != head; p = p.prev){
			st.append(p.data + "\r\n");
		}
		return st.toString();
	}
} 