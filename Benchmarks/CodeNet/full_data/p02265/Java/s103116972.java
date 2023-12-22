import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		dList dl = new dList();
		long n, key;
		String command;
		
		n = sc.nextLong();
		
		for(long i = 0; i < n; i++){
			command = sc.next();
			
			if(command.equals("deleteFirst")){
				dl.deleteFirst();
			}
			else if(command.equals("deleteLast")){
				dl.deleteLast();
			}
			else{
				key = sc.nextLong();
				
				if(command.equals("insert")){
					dl.insert(key);
				}
				else if(command.equals("delete")){
					dl.delete(key);
				}
			}
			
		}
		
		dl.viewList();
	}
}

class element{
	long key;
	element prev, next;
	
	element(long key){
		this.key = key;
	}
}

class dList{
	element dummy;
	
	dList(){
		dummy = new element(-1);
	}
	
	void insert(long x){
		element newE = new element(x);
		
		if(dummy.next == null){
			dummy.next = newE;
			newE.prev = dummy;
		}
		else{
			newE.prev = dummy;
			newE.next = dummy.next;
			dummy.next.prev = newE;
			dummy.next = newE;
		}
	}
	
	void delete(long x){
		element delE = dummy;
		int isExist = 0;
		
		while(delE.next != null){
			if(delE.key == x){
				isExist = 1;
				break;
			}
			delE = delE.next;
		}
		
		if(delE.next == null && delE.key == x){
			delE.prev.next = null;
		}
		else if(isExist == 1){
			delE.next.prev = delE.prev;
			delE.prev.next = delE.next;
		}
	}
	
	void deleteFirst(){
		dummy.next.next.prev = dummy;
		dummy.next = dummy.next.next;
	}
	
	void deleteLast(){
		element last = dummy;
		
		while(last.next != null){
			last = last.next;
		}
		
		last.prev.next = null;
		last.prev = null;
	}
	
	void viewList(){
		element ele = dummy.next;
		StringBuilder sb = new StringBuilder();
		
		while(ele != null){
			sb.append(ele.key + " ");
			ele = ele.next;
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb.toString());
	}
}