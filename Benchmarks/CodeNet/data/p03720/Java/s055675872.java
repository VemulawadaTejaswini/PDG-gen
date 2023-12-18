import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for(int i = 0; i < m * 2; i++) {
			int a = sc.nextInt();
			if(map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			}else {
				map.put(a, 1);
			}
		}
		
		for(int i: map.keySet()) {
			System.out.println(map.get(i));
		}

		
		
		
	}	

}

