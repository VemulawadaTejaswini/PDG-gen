
import java.util.Scanner;

public class Main {
	
	// the generic node class
	static class node<T>{
		public T data;
		public node<T> next;
		public node<T> prev;
		
		public node(T _data){
			data = _data;
			next = null;
			prev = null;
		}
		
	}
	
	// the doubly linked list class, composed with node class
	static class doubly_linked_list<T>{
		public node<T> front;
		public node<T> end;
		public int size;
		
		public doubly_linked_list() {
			front = null;
			end = null;
			size = 0;
		}
		
		public void display() {
			node<T> ptr = front;
			while(ptr!=null) {
				System.out.print(ptr.data);
//				if(ptr.next!=null) {
//					System.out.print(" ");
//				}
//				
				ptr = ptr.next;
			}
		}
		
		//insert the data at the front of the doubly
		public void insert(T x) {
			// if front has not yet been set
			if(front == null) {
				front = new node<T>(x);
				end = front; 
				size ++;
				return;
			}
			
			node<T> creation = new node<T>(x);
			//otherwise, set right the pointers
			creation.next = front;
			front.prev = creation;
			front = creation;
			size++;
			return;
		}
		
		public void delete(T x) {
			if(front == null) {
				return; // nothing to be removed
			}
			
			//which means there is exactly one element
			if(front == end) {
				if(front.data.equals(x)) {
					size--;
					front = end = null;
				}else {
					return;
				}
			}
			
			// we can ensure that front != end
			//then do iteration
			node<T> ptr = front;
			while(ptr!=null) {
				if(ptr.data.equals(x)) {
					//do deletion and then return(we should maintain both the front and end and the prev and next relation)
					if(ptr==front) {
						front = ptr.next;
						if(front!=null) {
							front.prev = null;
						}
					}else if(ptr == end) {
						end = ptr.prev;
						if(end!=null) {
							end.next = null;
						}
					}else { // the most common situation
						ptr.prev.next = ptr.next;
						ptr.next.prev = ptr.prev;
					}
					
					size--;
					return;
				}
				// iteration
				ptr = ptr.next;
			}

		}
		
		
		public void delete_first() {
			if(front == null) {
				return;
			}
			
			front = front.next;
			front.prev = null;
			size--;
			return;
		}
		
		public void delete_last() {
			if(end == null) {
				return;
			}
			
			end = end.prev;
			end.next = null;
			size --;
			return;
		}

		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int len = cin.nextInt();
		doubly_linked_list<Integer> list = new doubly_linked_list<Integer>();
		String cmd;
		int val;
		while(len > 0) {
			cmd = cin.next();
			if(cmd.equals("delete")) {
				val = cin.nextInt();
				list.delete(val);
			}else if(cmd.equals("insert")) {
				val = cin.nextInt();
				list.insert(val);
			}else if(cmd.equals("deleteFirst")) {
				list.delete_first();
			}else if(cmd.equals("deleteLast")) {
				list.delete_last();
			}
			
			
			len--;
		}
		
		
		list.display();
		
		cin.close();
		
	}
	
}