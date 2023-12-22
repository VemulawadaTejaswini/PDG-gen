import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		Link linkList = new Link();
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
		linkList.printList();
	}
	class Data{
		private Data prev;
		private String str;
		public Data(Data prev,String str){
			this.prev = prev;
			this.str = str;
		}
		public void setLink(Data prev){
			this.prev = prev;
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
		public Link(){
			head = new Data(null,null);
		}
		public void insertList(String str){
			Data data = new Data(head.getLink(),str);
			head.setLink(data);
		}
		public void deleteList(String str){
			Data a = head.getLink();
			Data prev = head;
			while(!a.getStr().equals(str)){
				prev = a;
				a = a.getLink();
				if(a == null){
					return;
				}
			}
			if(a.getLink() == null){
				prev.setLink(null);
			}else{
				prev.setLink(a.getLink());
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
		}
		public void deleteFirst(){
			Data a = head;
			a.setLink(head.getLink().getLink());
		}
		public void printList(){
			Data a = head.getLink();
			while(a != null){
				System.out.print(a.getStr());
				if(a.getLink() != null){
					System.out.print(" ");
				}else{
					System.out.println();
				}
				a = a.getLink();
			}
		}
	}
}