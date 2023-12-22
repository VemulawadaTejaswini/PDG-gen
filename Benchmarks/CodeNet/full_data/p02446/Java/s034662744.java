import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		int n = src.nextInt();	//n要素数


		ArrayList<Integer> list = new ArrayList<>();	//list

		for(int i=0; i<n; i++) {
			list.add(src.nextInt());
		}


		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);	//
		ArrayList<Integer> list2 = new ArrayList<>(set);


		for(int i=0; i<list2.size()-1; i++) {
			System.out.print(list2.get(i) + " ");
		}
		System.out.println(list2.get(list2.size()-1));
	}
}
