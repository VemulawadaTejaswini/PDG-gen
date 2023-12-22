import java.util.Scanner;
class Node{
	Node prev;
	Node next;
	int key;
	Node(){
		prev=this;
		next=this;
		key=-1;
	}
	Node(Node prev,Node next,int key){
		this.prev=prev;
		this.next=next;
		this.key=key;
	}
}
public class Main {
	static Node head,crnt;
	
	static void insert(int key){
		Node tmp=new Node(head,head.next,key);
		head.next=head.next.prev=tmp;
	}
	
	static void remove(){
		if(head.next!=head){
			crnt.prev.next=crnt.next;
			crnt.next.prev=crnt.prev;
			crnt=crnt.prev;
		}
	}
	
	static void delete(int key){
		crnt=head.next;
		while(crnt!=head){
			if(crnt.key==key){
				remove();
				break;
			}
			crnt=crnt.next;
		}
	}
	
	static void deleteFirst(){
		crnt=head.next;
		remove();
	}
	
	static void deleteLast(){
		crnt=head.prev;
		remove();
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String command;
		int key;
		head=crnt=new Node();
		for(int i=0;i<n;i++){
			command=scan.next();
			if(command.equals("insert")){
				key=scan.nextInt();
				insert(key);
			}else if(command.equals("delete")){
				key=scan.nextInt();
				delete(key);
			}else if(command.equals("deleteFirst")){
				deleteFirst();
			}else{
				deleteLast();
			}
		}
		key=0;
		crnt=head.next;
		while(crnt!=head){
			if(key==0){
				System.out.print(crnt.key);
				key++;
			}else{
				System.out.print(" "+crnt.key);
			}
			crnt=crnt.next;
		}
		System.out.println();
		scan.close();
	}
}