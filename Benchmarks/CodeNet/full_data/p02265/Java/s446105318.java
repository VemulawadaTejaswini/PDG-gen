import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
  
public class Main {
	
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
    
    public void exec() throws IOException {
    	SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
    	int n = in.readInt();
    	
    	for(int i=0; i<n; i++) {
    		String[] cmd = in.br.readLine().split(" ");
    		if(cmd[0].equals("insert")){
    			DoublyLinkedList.insert(Integer.parseInt(cmd[1]));
    		} else if(cmd[0].equals("delete")){
    			DoublyLinkedList.delete(Integer.parseInt(cmd[1]));
    		} else if(cmd[0].equals("deleteFirst")){
    			DoublyLinkedList.deleteFirst();
    		} else {
    			DoublyLinkedList.deleteLast();
    		}
    	}
    	out.println(DoublyLinkedList.listToString());
    	out.flush();
    }
}

class DoublyLinkedList {
	public static DoublyLinkedList head = null;
	public static DoublyLinkedList tail = null;
	
	public static void insert(int x) {
		DoublyLinkedList newElem = new DoublyLinkedList(x);
		newElem.next = head;
		if(head != null) {
			head.prev = newElem;
		}
		head = newElem;
		if(tail == null) {
			tail = head;
		}
	}
	
	public static void deleteFirst() {
		if(head == null) throw new IllegalStateException();
		head = head.next;
		if(head == null)
			tail = null;
		else
			head.prev = null;
	}
	
	public static void deleteLast() {
		if(tail == null) throw new IllegalStateException();
		tail = tail.prev;
		if(tail == null)
			head = null;
		else
			tail.next = null;
	}
	
	public static void delete(int x) {
		for(DoublyLinkedList now = head; now != null; now = now.next) {
			if(now.value == x) {
				if(now == head) {
					deleteFirst();
				} else if(now == tail) {
					deleteLast();
				} else {
					now.prev.next = now.next;
					now.next.prev = now.prev;
				}
				return;
			}
		}
	}
	
	public static String listToString() {
		StringBuilder sb = new StringBuilder();
		for(DoublyLinkedList now = head; now != null; now = now.next) {
			if(now.prev != null) {
				sb.append(" ");
			}
			sb.append(now.value);
		}
		return sb.toString();
	}

	int value = -1;
	DoublyLinkedList next = null;
	DoublyLinkedList prev = null;
	
	public DoublyLinkedList(int x) {
		value = x;
	}
	

}

class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
    	return br.readLine().split(delim);
    }
    
    public int readInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }
    
    public int[] readIntArray(int[] a) throws NumberFormatException, IOException{
        int i=0;
        while(i<a.length) {
            for(String s: br.readLine().split(" ")){
            	if(i<a.length) {
                    a[i++] = Integer.parseInt(s);
            	}
            }
        }
        return a;
    }

    
}