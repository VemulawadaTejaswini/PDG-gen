import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		while(sc.hasNext()){
			String str = sc.nextLine();
			String[] s = str.split(" ");
			
			if(s.length==1 && s[0].equals("end"))
				break;
			else if(s.length==1){
				int max=0;
				int index=0;
				for(int i=0;i<list.size();i++){
					if(list.get(i)>max){
						max=list.get(i);
						index=i;
					}
				}
				System.out.println(list.remove(index));
			}
			else{
				int num = Integer.parseInt(s[1]);
				list.add(num);
			}
		}
		
	}
}
