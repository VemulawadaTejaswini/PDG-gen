import java.util.*;
import java.io.*;

public class Main {
	
	private static class Pair {
		private int x;
		private int y;
	}
	
	public static void main(String[] args) {
		int sum = 0;
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Pair> s2 = new Stack<Pair>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String map;
		try {
			map = br.readLine();
			br.close();
		} catch (Throwable t) {
			return;
		}
		
		for (int i = 0; i < map.length(); i ++) {
			switch (map.charAt(i)) {
				case '\\':
					s1.add(i);
					
					Pair pair = new Pair();
					pair.x = i;
					pair.y = 0;
					s2.add(pair);
					
					break;
				case '/':
					if (s1.isEmpty()) break;
					int j = s1.pop();
					sum += i - j;
					
					Pair pair1 = s2.pop();
					int l = 0;
					int sum1 = 0;
					
					while (pair1.x > j) {
						l ++;
						sum1 += pair1.y;
						if (s2.isEmpty()) break;
						pair1 = s2.pop();
					} 
					sum1 += i- j;
					
					if (pair1.x <= j) s2.add(pair1);
					
					Pair pair2 = new Pair();
					pair2.x = j;
					pair2.y = sum1;
					s2.add(pair2);
					
					break;
			}
		}
		
		int[] l = new int[s2.size()];
		int k = 0;
		while (!s2.isEmpty()) {
			int lk = s2.pop().y;
			if (lk == 0) continue;
			l[k++] = lk;
		}
		
		System.out.println(sum);
		
		System.out.print(k);
		for (int i = k - 1; i >= 0; i --) {
			System.out.print(" ");
			System.out.print(l[i]);
		}
		System.out.println();	
	}
} 

