import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int count=0;
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<a;i++) {
			int c=Integer.parseInt(sc.next());
			li.add(c);
		}
		int i=0;
		while(i<li.size()) {
			if(i+1!=li.get(i)) {
				li.remove(i);
				count++;
				
			}
			else {
				i++;
			}
		}
		if(li.size()==0) {
			count=-1;
		}
		
		System.out.println(count);
	}
}