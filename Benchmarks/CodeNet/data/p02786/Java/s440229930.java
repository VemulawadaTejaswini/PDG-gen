import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static long H = scan.nextLong();
	static long min = 0;
	//static long []memo = new long[H+1];
	//static boolean []check = new boolean[H+1];
	static Set<Long> memo = new HashSet<Long>();
	static Map<Long,Long> me = new HashMap<Long,Long>();
	static ArrayList<Long> meno = new ArrayList<Long>();
	static Set<Boolean> cheak = new HashSet<Boolean>();
	
	public static void main(String[]args) {
		
			
			
			
			
			System.out.println(monster(H));
			
			
			
			
		
		
		
	}

	private static long monster(long h) {
		
		
		if(h==1) {
			
			return 1;	
		}else {
			long k = h/2;
			return 1+2*monster(k);
			
			
		}
		}
}