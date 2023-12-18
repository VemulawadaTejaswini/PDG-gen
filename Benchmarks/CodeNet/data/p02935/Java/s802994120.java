import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		Double[] in = new Double[N];
		
		for (int i = 0; i < N; i++) in[i] = Double.parseDouble(sc.next());
		
		List<Double> list = new ArrayList<>(Arrays.asList(in));
		for (int i = 0; i < N-1; i++) {	
			Collections.sort(list);
			Double val = (list.get(0) + list.get(1)) / 2;
			list.remove(0);
			list.remove(0);
			list.add(val);
		}
		
		System.out.println(list.get(0));
	}
}
