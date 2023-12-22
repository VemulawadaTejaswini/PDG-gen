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
			newE.next = dummy;
			dummy.prev = newE;
		}
		else{
			newE.prev = dummy;
			newE.next = dummy.next;
			dummy.next.prev = newE;
			dummy.prev = dummy.next;
			dummy.next = newE;
		}
	}
	
	void delete(long x){
		element delE = dummy.next;
		int isExist = 0;
		
		while(delE.key != dummy.key){
			if(delE.key == x){
				isExist = 1;
				break;
			}
			delE = delE.next;
		}
		
		if(delE.key == dummy.key && delE.key == x){
			delE.prev.next = dummy;
		}
		else if(isExist == 1){
			delE.next.prev = delE.prev;
			delE.prev.next = delE.next;
		}
	}
	
	void deleteFirst(){
		element first = dummy.next;
		
		if(first.next == null){
			dummy.next = null;
		}
		else{
			first.next.prev = dummy;
			dummy.next = first.next;
		}
	}
	
	void deleteLast(){
		element last = dummy.prev;
		
		last.prev.next = dummy;
	}
	
	void viewList(){
		element ele = dummy.next;
		StringBuilder sb = new StringBuilder();
		
		while(ele.key != dummy.key){
			sb.append(ele.key + " ");
			ele = ele.next;
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb.toString());
	}
}