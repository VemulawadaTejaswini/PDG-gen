import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		for (int i=0; i<3; i++) {
			list.add(sc.nextInt());
		}
		
		sc.close();
		
		insertionSort(list);
		
		String str = "";
		for (int i : list) {
			str += String.valueOf(i) + " ";
		}
		System.out.println(str.trim());
	}
	
	static List<Integer> insertionSort(List<Integer> list) {
		for (int i=1; i<list.size(); i++) {
			int v = list.get(i);
			int j = i - 1;
			while (j >= 0 && list.get(j) > v) {
				list.set(j + 1, list.get(j));
				j--;
			}
			list.set(j + 1, v);
		}
		return list;
	}
}