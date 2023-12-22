import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sca=new Scanner(System.in);	
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		int num=0;
		int max=Integer.MIN_VALUE;
		int index=0;
		int count=0;
		int c=0;
			
			while(true){
				
				String a=sca.next();
				
				if(c>0){
					System.out.println();
				}
				c++;
				
				if(a.equals("end")){
					break;
				}
				
				if(a.equals("insert")){
					num=sca.nextInt();
					list.add(num);
					if(num>max){
						max=num;
						index=list.size()-1;
						count=1;
					}
				}
				else if(a.equals("extract")){
					if(list.size()>0){
						if(count!=0){
							System.out.print(list.remove(index));
							count=0;
						}
						else{
							max=Integer.MIN_VALUE;
							for(int i=0;i<list.size();i++){
								if(list.get(i)>max){
									max=list.get(i);
									index=i;
								}
							}
							System.out.print(list.remove(index));
						}
					}
					max=Integer.MIN_VALUE;
				}
				
			}
		
	}
}

/*
insert 8
insert 2
extract
extract
insert 8
insert 2
extract
extract
insert 9
end
*/



