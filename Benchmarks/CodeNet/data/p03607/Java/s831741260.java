import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		LinkedList<Long> list = new LinkedList<Long>();
		
		for(int i = 0; i < n; i++) {
			long a = Long.parseLong(sc.next());
			
			if(list.contains(a)) {
				list.remove(a);
			}else{
				list.add(a);
			}
		}
		
		System.out.println(list.size());
		
	}
}
