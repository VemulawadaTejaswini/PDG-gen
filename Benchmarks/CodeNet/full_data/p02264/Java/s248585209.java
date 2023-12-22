import java.util.*;

public class Main{
	public static void main(String args[]){
	Scanner sca=new Scanner(System.in);
	int num=sca.nextInt();
	int q=sca.nextInt();
	
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<num;i++){
			list.add(i);
			sca.next();
			list.add(sca.nextInt());
		}
		
		int present=0;
		while(list.size()>0){
			for(int i=0;i<list.size();i++){
				int number=list.remove();
				int time=list.remove();
				if(time<=q){
					present=present+time;
					System.out.println("p"+(number+1)+" "+present);
				}
				else{
					list.add(number);
					list.add(time-q);
					present=present+q;
				}
			}
		}
	
	}
}

/*
5 100
p1 150
p2 80
p3 200
p4 350
p5 20 
*/



