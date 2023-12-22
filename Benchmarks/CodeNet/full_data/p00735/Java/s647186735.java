import java.util.*;
public class Main { 
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makeList();
		Collections.sort(list);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 1) break;
			System.out.print(n+":");
			for(int i = 0; i < list.size(); i++) {
				int a = list.get(i);
				if(a > n) break;
				if(n % a == 0) {
					System.out.print(" " + a);
				}
			}
			System.out.println();
		}
	}
	
	public static void makeList() {
		list.add(6);
		for(int i = 2; i <= 300000; i++) {
			int a = 7 * i - 1;
			int b = 7 * i - 6;
			if(a >= 400000 || b >= 400000) break;
			if(isPrime(a)) {
				list.add(a);
			}
			if(isPrime(b)) {
				list.add(b);
			}
		}
	}
	
	public static boolean isPrime(int n) {
		for(int i = 0; i < list.size(); i++) {
			if(n % list.get(i) == 0) {
				return false;
			}
		}
		return true;
	}
}