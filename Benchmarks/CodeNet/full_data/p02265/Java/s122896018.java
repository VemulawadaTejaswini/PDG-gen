import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		Link linkList = new Link();
		while(scan.hasNext()){
			int n = Integer.parseInt(scan.nextLine());
			for(int i = 0;i < n;i++){
				String[] str = scan.nextLine().split(" ");
				if(str[0].equals("insert")){
					linkList.insertList(str[1]);
				}else if(str[0].equals("delete")){
					linkList.deleteList(str[1]);
				}else if(str[0].equals("deleteFirst")){
					linkList.deleteFirst();
				}else if(str[0].equals("deleteLast")){
					linkList.deleteLast();
				}
			}
			System.out.println(linkList.ansLinkString());
			linkList.clearList();
		}
	}
	class Data{
		private Data prev;
		private String str;
		public Data(Data prev,String str){
			this.prev = prev;
			this.str = str;
		}
		public void set(Data prev,String str){
			this.prev = prev;
			this.str = str;
		}
		public void setLink(Data prev){
			this.prev = prev;
		}
		public void setStr(String str){
			this.str = str;
		}
		public Data getLink(){
			return prev;
		}
		public String getStr(){
			return str;
		}
	}
	class Link{
		private Data head;
		private int size;
		public Link(){
			head = new Data(null,null);
			size = 0;
		}
		public void insertList(String str){
			Data data = new Data(head.getLink(),str);
			size++;
			head.setLink(data);
		}
		public void deleteList(String str){
			Data a = head.getLink();
			Data prev = head;
			boolean fl = false;
			while(!a.getStr().equals(str)){
				prev = a;
				a = a.getLink();
				if(a == null){
					fl = true;
					break;
				}
			}
			if(fl){
			}else if(a.getLink() == null){
				prev.setLink(null);
				size--;
			}else{
				prev.setLink(a.getLink());
				size--;
			}
			
		}
		public void deleteLast(){
			Data a = head.getLink();
			Data prev = head;
			while(a.getLink() != null){
				prev = a;
				a = a.getLink();
			}
			prev.setLink(null);
			size--;
		}
		public void deleteFirst(){
			Data a = head;
			a.setLink(head.getLink().getLink());
			size--;
		}
		public boolean isEmpty(){
			return (size==0)?true:false;
		}
		public String linkString(){
			String str = "(";
			Data a = head.getLink();
			while(a != null){
				str += " " + a.getStr();
				a = a.getLink();
			}
			str += " )";
			return str;
		}
		public String ansLinkString(){
			String str = "";
			Data a = head.getLink();
			while(a != null){
				str += a.getStr();
				if(a.getLink() != null){
					str += " ";
				}
				a = a.getLink();
			}
			return str;
		}
		public void clearList(){
			size = 0;
			head.setLink(null);
		}
	}
}