import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<Integer>();
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			for (int i = 0; i < n; i++) {
				int add = sc.nextInt();
				
				if(list.size() == 0){
					list.add(add);
					continue;
				}
				
				boolean ins = false;
				for(ListIterator<Integer> ite = list.listIterator(); ite.hasNext();){
					if(ite.next() > add){
						ite.previous();
						ite.add(add);
						ins = true;
						break;
					}
				}
				
				if(!ins){
					list.add(add);
				}
			}

			int pre_num = 0;
			int mati = 0;
			int sum = 0;
			for (int i : list) {
				mati += pre_num;
				sum += mati;
				pre_num = i;
			}

			System.out.println(sum);
		}

	}
}