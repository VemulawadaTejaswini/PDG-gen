import java.io.*;
import java.util.*;

public class Main{

    static Node nil;
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


	init();
	
	int n=Integer.parseInt(br.readLine());

	for(int i=0;i<n;i++){
	    String str[]=br.readLine().split(" ");

	    if(str[0].equals("insert")){
		insert(Integer.parseInt(str[1]));
		
	    }else if(str[0].equals("delete")){
		delete(Integer.parseInt(str[1]));
		
	    }else if(str[0].equals("deleteFirst")){
		deleteFirst();
		
	    }else{
		deleteLast();
	    }
	}
	printList();
    }

    static void init(){
	nil=new Node();
    }

    static void printList(){
	Node cur=nil.next;
	int isf=1;

	while(true){
	    if(cur.equals(nil))
		break;

	    if(isf==0)
		System.out.print(" ");

	    System.out.print(cur.key);
	    cur=cur.next;
	    isf=0;
	}
	System.out.print("\n");
    }


    static void deleteFirst(){
	Node t = nil.next;
	if ( t == nil )
	    return;
	delete(t.key);
    }

    static void deleteLast(){
	Node del=nil.prev;
	nil.prev=del.prev;
	del.prev.next=nil;

	del.next=null;
	del.prev=null;
    }

    static void delete(int key){
        Node del=nil.next;

	while(del != nil){
	    if(del.key==key){
		del.prev.next=del.next;
		del.next.prev=del.prev;

		del.next=null;
		del.prev=null;
		return;
		
	    }
	    del=del.next;
	}
    }


    static void insert(int key){
	Node x=new Node(key);

	x.next=nil.next;
	x.prev=nil;

	x.next.prev=x;
	nil.next=x;
	
    }
}


class Node{
    int key;
    Node next;
    Node prev;

    public Node(){
	this.next=this;
	this.prev=this;
    }

    public Node(int key){
	this.key=key;
    }
}

