import java.util.*;
public class Main {
	public static ArrayList<Integer> list;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		list = new ArrayList<Integer>();
		makeList();
		while(true) {
			int a = stdIn.nextInt();
			int d = stdIn.nextInt();
			int n = stdIn.nextInt();
			
			if(a == 0 && d == 0 && n == 0) break;
			int count = 0;
			int c = 0;
			while(true) {
				int tmp = a + d * c++;
				if(Collections.binarySearch(list, tmp) >= 0) {
					count++;
					if(count == n) {
						System.out.println(tmp);
						break;
					}
 				}
			}
		}
	}
	public static void makeList() {
		boolean[] isPrime = new boolean[1000001];
		for(int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		for(int i = 2; i < isPrime.length; i++) {
			if(isPrime[i]) {
				list.add(i);
				for(int j = i + i; j < isPrime.length; j+=i) {
					isPrime[j] = false;
				}
			}
		}
	}
}