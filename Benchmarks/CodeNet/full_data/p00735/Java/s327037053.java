import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i = 0; i <= Math.sqrt((700000 / 7)); i++){
			list.add(7*i + 1);
			list.add(7*i + 6);
		}
		
		
		for(ListIterator<Integer> ite1 = list.listIterator(1); ite1.hasNext(); ){
			int num = ite1.next();
			boolean flag = true;
			
			for(ListIterator<Integer> ite2 = list.listIterator(ite1.previousIndex()); ite2.hasPrevious(); ){
				int num2 = ite2.previous();
				//System.out.println(num + " " + num2);
				
				if(num2 != 1){
					if(num % num2 == 0){
						flag = false;
						break;
					}
				}
			}
			
			if(!flag){
				ite1.remove();
			}
			
		}
		
		list.remove(0);
		//System.out.println(list);
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 1){
				break;
			}
			
			int num = n;
			boolean first = true;
			StringBuilder pre = new StringBuilder();
			
			for(int i : list){
				num = n;
				
				if(num % i == 0){
					pre.append(" " + i);
					if(first){
						first = false;
					}
					
					num /= i;
					while (num % i == 0) {
						num /= i;
					}
					
				}
			}
			
			System.out.println(n + ":" + (first ? " " + n : pre));
		}
	}

}