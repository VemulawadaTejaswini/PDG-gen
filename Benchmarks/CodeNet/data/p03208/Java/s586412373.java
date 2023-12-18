import java.util.Scanner;

import java.util.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		List<Integer> h = new ArrayList<>(n);


		for(int i = 0; i < n; i++){
			h.add(scan.nextInt());
		}
		Collections.sort(h);

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n - k + 1; i++){
			int d = h.get(i+k-1) - h.get(i);
			if (d < min) min = d;
		}
		System.out.println(min);
	}
}
