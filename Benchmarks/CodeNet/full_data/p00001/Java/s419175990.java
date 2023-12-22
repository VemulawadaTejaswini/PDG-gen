
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		List<Integer> in = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) in.add(sc.nextInt());
		sc.close();
		
		List<Integer> result = top3(in);
		for(Integer i: result) System.out.println(i);
	}
	
	static List<Integer> top3(List<Integer> l) {
		List<Integer> copy = new ArrayList<Integer>(l);
		copy.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2){return (o1 > o2) ? -1: 1;}
		});
		return copy.subList(0, 3);
	}
}