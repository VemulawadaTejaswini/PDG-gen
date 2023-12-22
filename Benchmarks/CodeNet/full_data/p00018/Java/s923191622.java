import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		List<Integer> li = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			li.add(sc.nextInt());
		}
		sc.close();
		
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2){
				if(o1 > o2) return -1;
				else if(o1 == o2) return 0;
				else return 1;
			}
		};
		
		Collections.sort(li, c);
		showList(li);
		
	}
	
	static <E> void showList(List<E> list){
		for(int i = 0; i < list.size()-1; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(list.size() - 1));
	}
}