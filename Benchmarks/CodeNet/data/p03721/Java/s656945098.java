import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
 


public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		long N=sc.nextInt();
		long K=sc.nextInt();
		Map<String, Long> map = new HashMap<String, Long>((int) N);
		for(int i=0;i<N;i++) {
			String a=sc.next();
			long b=sc.nextInt();
			if(!map.containsKey(a)) {
				map.put(a, (long) 0);
			}
			map.replace(a, map.get(a)+b);
		}
		
		Object[] a=map.keySet().toArray();
		Arrays.sort(a);
		
		for(Object i:a) {
			long b=map.get(i+"");
			
			if(K<=b) {
				p(i+"");
				break;
			}else {
				K-=b;
			}
		}
		
		
	}
	
	
	
	
		
	
	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
