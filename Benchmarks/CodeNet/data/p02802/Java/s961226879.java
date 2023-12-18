import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute10_1();
	}

	private static void execute10_2() {
		
		
	}
	private static void execute10_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			Set<Integer> status = new HashSet<>();
			int c =0;
			int w =0;
			
			for(int i=0; i<m; i++) {
				int p = sc.nextInt();
				String s = sc.next();
				
				if(!status.contains(p)) {
					if("AC".equals(s)) {
						c++;
						status.add(p);
					} else {
						w++;
					}
				}
			}
		
		System.out.println(c+" "+w);
		
		}
	}
	
}