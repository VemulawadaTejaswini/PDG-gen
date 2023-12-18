import java.io.*;
import java.util.*;
class Queue{
    Node front;
    Node rear;
    static class Node{
        char p;
        Node n_link;
        Node p_link;
        Node(char d){
            this.p=d;
            this.n_link=null;
            this.p_link=null;
        }
    }
    public static Queue insert_end(Queue q,char p){
        Node n_node= new Node(p);
        if(q.front==null && q.rear==null ){
            q.front=n_node;
            q.rear=n_node;
        }
        else{
            n_node.p_link=q.rear;
            q.rear.n_link=n_node;
            q.rear=n_node;
        }
        return q;
    }
    public static Queue insert_begin(Queue q,char p){
        Node n_node= new Node(p);
        if(q.front==null && q.rear==null ){
            q.front=n_node;
            q.rear=n_node;
        }
        else{
            n_node.n_link=q.front;
            q.front.p_link=n_node;
            q.front=n_node;
        }
        return q;
    }
    
    public static void print(Node ptr){
        if(ptr.n_link==null){
            while(ptr!=null){
                System.out.print(ptr.p);
                ptr=ptr.p_link;
            }
        }
        else{
            while(ptr!=null){
                System.out.print(ptr.p);
                ptr=ptr.n_link;
            }
        }
    }
	public static void main (String[] args) {
		Queue q = new Queue();
		Scanner input=new Scanner(System.in);
        String n=input.nextLine();
        int t=input.nextInt();
        for(int i=0;i<n.length();i++){
            q=insert_end(q,n.charAt(i));
        }
        for(int i=0;i<t;i++){
            int a=input.nextInt();
            if(a==1){
                Node ptr=q.front;
                q.front=q.rear;
                q.rear=ptr;
            }
            else{
                int b=input.nextInt();
                if(b==1){
                    String c=input.next();
                    q=insert_begin(q,c.charAt(0));
                }
                else{
                    String d=input.next();
                    q=insert_end(q,d.charAt(0));
                    
                }
            }
        }
        print(q.front);
}
}