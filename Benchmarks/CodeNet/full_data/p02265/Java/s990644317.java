import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			String com;
			String com_data[];
			Node workNode;
			int i;

			Node headNode = new Node();
			Node tailNode = new Node();
			init(headNode, tailNode, -1);

			Node reuseHeadNode = new Node();
			Node reuseTailNode = new Node();
			init(reuseHeadNode, reuseTailNode, -1);

			for(i=0; i<n; i++){
				com = br.readLine();
				if(com.equals("deleteFirst")){
					workNode=headNode.getNext();
					if(workNode!=tailNode){
						delete(workNode);
						insert(reuseHeadNode, workNode, -1);
					}
				} else if(com.equals("deleteLast")){
					workNode=tailNode.getPrev();
					if(workNode!=headNode){
						delete(workNode);
						insert(reuseHeadNode, workNode, -1);
					}
				} else{
					com_data = com.split(" ", 0);
					if(com_data[0].equals("insert")){
						workNode=reuseHeadNode.getNext();
						if(workNode!=reuseTailNode){
							delete(workNode);
							insert(headNode, workNode, Integer.parseInt(""+com_data[1]));
						} else{
							Node insertNode = new Node();
							insert(headNode, insertNode, Integer.parseInt(""+com_data[1]));
						}
					} else if(com_data[0].equals("delete")){
						for(workNode=headNode.getNext();
							workNode.getData()!=-1;
							workNode=workNode.getNext()){
							if(workNode.getData()==Integer.parseInt(""+com_data[1])){
								delete(workNode);
								insert(reuseHeadNode, workNode, -1);
								break;
							}
						}
					}
				}
			}

			for(workNode=headNode.getNext(),i=0;
				workNode.getData()!=-1;
				workNode=workNode.getNext(),i++){
				if(i!=0) System.out.print(" ");
				System.out.print(workNode.getData());
			}
			System.out.println();
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
	static void init(Node headNode, Node tailNode, int data){
		headNode.setData(data);
		headNode.setNext(tailNode);
		tailNode.setData(data);
		tailNode.setPrev(headNode);
	}
	static void insert(Node headNode, Node insertNode, int data){
		insertNode.setData(data);
		insertNode.setNext(headNode.getNext());
		insertNode.setPrev(headNode);
		headNode.getNext().setPrev(insertNode);
		headNode.setNext(insertNode);
	}
	static void delete(Node workNode){
		workNode.getPrev().setNext(workNode.getNext());
		workNode.getNext().setPrev(workNode.getPrev());
	}
}
class Node{
	private int data;
	private Node prev;
	private Node next;
	public int getData(){
		return data;
	}
	public Node getPrev(){
		return prev;
	}
	public Node getNext(){
		return next;
	}
	public void setData(int data){
		this.data = data;
	}
	public void setPrev(Node prev){
		this.prev = prev;
	}
	public void setNext(Node next){
		this.next = next;
	}
}