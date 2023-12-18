import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			int x = sc.nextInt();
			if (min > x) min = x;
			set.add(x);
		}
		
		int count = 1;
		while(count != 0) {
			count = 0;
			HashSet<Integer> ap = new HashSet<Integer>();
			for(int x : set) {
				for (int y : set) {
					if (x-y > 0) {
						ap.add(x-y);
						
						if(x - y < min) {
							min = x-y;
							count++;
						}
					}
					
				}
			}
			set.addAll(ap);
		}
		System.out.println(min);
	}
}