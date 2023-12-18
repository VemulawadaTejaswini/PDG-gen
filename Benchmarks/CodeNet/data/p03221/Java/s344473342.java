import java.util.*;

public class Main {
    
    void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() , m=sc.nextInt();
	    Node[] lst = new Node[n];
		
	    for(int i=0;i<m;i++){
		    insert(lst,i,sc.nextInt(),sc.nextInt());
	}
	
	    print(lst,n,m);
	}
	
	void insert(Node[] lst,int i,int num,int year){
		Node x = lst[num-1];
		if (x==null)lst[num-1] = new Node(i,year,1,null);
		else{
			int c=1;
			while(true){
			    if(x.getYear()>year)x.setCnt(x.getCnt()+1);
			    else c++;
			    if(x.getNext()==null)break;
			    x=x.getNext();
			}
			x.next=new Node(i,year,c,null);
		}
	}
	
	void print(Node[] lst,int n,int m){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
			    if(lst[j]==null)continue;
				if(lst[j].getCityNum()==i){
					System.out.printf("%06d%06d\n",j+1,lst[j].getCnt());
					lst[j]=lst[j].getNext();break;
				}
			}
		}
	}

	
	class Node{
		int cityNum ; 
		int cnt ;
		int year;
		Node next;
		
		Node(int cityNum,int year,int cnt,Node next){
			this.cityNum=cityNum;this.cnt=cnt;this.year=year;this.next=next;
		}
			
		Node getNext(){return next;}
			
		int getYear(){return year;}
		
		int getCnt(){return cnt;}
		
		int getCityNum(){return cityNum;}
		
		void setNext(Node x){next=x;}
		
		void setCnt(int n){cnt=n;}		
	}
    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}