import java.util.*;
public class Main{
	public static void main(String args[]){
	Scanner sca=new Scanner(System.in);	
	int num=sca.nextInt();
	
		LinkedList<Integer> list=new LinkedList<Integer>();
		while(num-->0){
			String a=sca.next();
			if(a.equals("insert")){
				list.add(sca.nextInt());
			}
			else if(a.equals("delete")){
				int b=sca.nextInt();
				for(int i=0;i<list.size();i++){
					if(list.get(i)==b){
						list.remove(i);
					}
				}
			}
			else if(a.equals("deleteFirst")){
				if(list.size()>0){
					list.remove(list.size()-1);
				}
			}
			else if(a.equals("deleteLast")){
				if(list.size()>0){
					list.remove(0);
				}
			}
		}
	
		for(int i=list.size()-1;i>=0;i--){
			if(i==0){
				System.out.println(list.get(i));
			}
			else{
				System.out.print(list.get(i)+" ");
			}
		}
		
		
	}
}

