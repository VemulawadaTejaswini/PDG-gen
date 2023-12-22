import java.util.Scanner;
class Node{
	Node prev;
	Node next;
	int n;
	Node(){
		prev=this;
		next=this;
	}
	Node(Node prev,Node next,int data){
		n=data;
		this.prev=prev;
		this.next=next;
	}
}
public class DoublyLinkedList {
	static Node head=new Node();
	static Node crnt=head;
	
	static void add(int x){
		Node tmp=new Node(crnt,crnt.next,x);
		crnt.next=crnt.next.prev=tmp;
		crnt=tmp;
	}
	
	static void insert(int x){
		crnt=head;
		add(x);
	}
	
	static boolean isEmpty(){
		return head.next==head;
	}
	
	static void removeCurrentNode(){
		if(!isEmpty()){
			crnt.prev.next=crnt.next;
			crnt.next.prev=crnt.prev;
			crnt=crnt.prev;
		}
	}
	
	static void deleteFirst(){//リストの先頭の要素を削除
		crnt=head.next;
		removeCurrentNode();
		
	}
	
	static void deleteLast(){
		crnt=head.prev;
		removeCurrentNode();
	}
	
	static void deleteX(int x){
		crnt=head.next;
		while(crnt!=head){
			if(crnt.n==x){
				removeCurrentNode();
				break;
			}
			crnt=crnt.next;
		}
	}
	
	static void output(){
		crnt=head.next;
		if(!isEmpty()){
			System.out.print(crnt.n);
			crnt=crnt.next;
			while(crnt!=head){
				System.out.print(" "+crnt.n);
				crnt=crnt.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s;
		int x;
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			s=scan.next();
			if(s.equals("insert")){
				x=scan.nextInt();
				insert(x);
			}else if(s.equals("delete")){
				x=scan.nextInt();
				deleteX(x);
			}else if(s.equals("deleteFirst")){
				deleteFirst();
			}else{
				deleteLast();
			}
		}
		output();
		scan.close();
	}

}