import java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < n ;i++) {
			int a = sc.nextInt();
			int b = Math.floorDiv(a, 400);
			if(!hm.containsKey(b)) {
				hm.put(b,1);
			}
			if(b >= 8) {
				count++;
			}
			
		}
		
	
		int min = 0;
		
		for(int num : hm.keySet()) {
			if(num < 8) {
				min += hm.get(num);
			}
		}
		if(min == 0) {
			System.out.println(1+" ");
			if(count >= 8) {
				System.out.println(8);
			}
			else {
				System.out.println(count);
			}
		}
		
		if(min > 0) {
			System.out.println(min+" ");
			if(min + count >= 8) {
				System.out.println(8);
			}
			else {
				System.out.println(min + count);
			}
		}

	}

}
