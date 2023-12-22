import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//?????????
		int num = Integer.parseInt(bf.readLine());
		String list;
		List node = new List(-1,null,null);
		while((list = bf.readLine())!=null){
			String command = list.split(" ")[0];
			
			if(command.equals("insert")){
				int key = Integer.parseInt(list.split(" ")[1]);
				node.returnFirst().setPre(new List(key,null,node.returnFirst()));
				node = node.getPre();
			}else if(command.equals("delete")){
				int key = Integer.parseInt(list.split(" ")[1]);
				List thisNode =node.searchKey(key);
				thisNode.getNext().setPre(thisNode.getPre());
				thisNode.getPre().setNext(thisNode.getNext());
			}else if(command.equals("deleteFirst")){
				node.getNext().setPre(null);
				node = node.getNext();
			}else if(command.equals("deleteLast")){
				List endNode = node.returnEnd();
				endNode.getPre().setNext(endNode.getNext());
				
			}
		}
		
		while(node.getKey()!=-1){
			System.out.printf("%d",node.getKey());
			if(node.getNext().getKey()!=-1){
				System.out.printf(" ");
			}
			node = node.getNext();
		}
	}
}

class List{
	private int key;
	private List pre;
	private List next;
	
	public List(int key,List pre, List next){
		this.setKey(key);
		this.setPre(pre);
		this.setNext(next);
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public List getPre() {
		return pre;
	}

	public void setPre(List pre) {
		this.pre = pre;
	}

	public List getNext() {
		return next;
	}

	public void setNext(List next) {
		this.next = next;
	}
	
	public List returnEnd(){
		if(this.next.getKey()==-1){
			return this;
		}else{
			return next.returnEnd();
		}
	}
	
	public List returnFirst(){
		if(this.pre==null){
			return this;
		}else{
			return this.pre.returnFirst();
		}
	}
	
	public List searchKey(int key){
		if(this.key==key){
			return this;
		}else{
			return next.searchKey(key);
		}
	}
}