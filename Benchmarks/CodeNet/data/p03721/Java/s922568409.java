import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<Integer, Integer> nums = new HashMap<Integer,Integer>();
		ArrayList<Integer> keys = new ArrayList<Integer>();
		int n = input.nextInt();
		int k = input.nextInt();
		int sum = 0;
		int currL = 0;
		for (int i = 0; i < n; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			if(!keys.contains(a)) {
				keys.add(a);
				nums.put(a, b);
			} else {
				nums.put(a, b + nums.get(a));
			}
			currL = a;
			if (sum + b < k) {
				sum += b;
			} else {
				System.out.println(currL);
				break;
			}
		}
	}
}





