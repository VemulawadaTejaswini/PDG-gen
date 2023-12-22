import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List <Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> listIter = list.listIterator();
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int command = sc.nextInt();
				switch (command) {

				case 0:
					int x = sc.nextInt();
					listIter.add(x);
					listIter.previous();
					break;

				case 1:
					int d = sc.nextInt();
					if (d > 0) {
						for (int j = 0; j < d; j++) {
							listIter.next();  
						}
					} else if (d < 0){
						int a = -d; 
						for (int j=0; j<a; j++) {
							listIter.previous(); 
						}
					}
					break;
					
				case 2:
					listIter.next();  
					listIter.remove();
					break;
				}
			}
			ListIterator<Integer> ite = list.listIterator();			
			while (ite.hasNext()) {
				System.out.println(ite.next());  
			}
		}
	}
}


