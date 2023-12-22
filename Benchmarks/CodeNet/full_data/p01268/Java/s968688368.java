import java.util.*;
public class Main {
	public static ArrayList<Integer> list;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		list = new ArrayList<Integer>();
		makeList(1000000);
		while(true) {
			int n  = stdIn.nextInt();
			int p = stdIn.nextInt();
			
			if(n == -1 &&p == -1) break;
			int ans = solv(n,p);
			System.out.println(ans);
			
		}
	}
	
	public static void makeList(int a) {
		boolean[] isPrime = new boolean[a];
		for(int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		for(int i = 2; i < isPrime.length; i++) {
			if(isPrime[i]) {
				list.add(i);
				for(int j = i + i; j < isPrime.length; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}
	
	public static int solv(int n, int p) {
		ArrayList<Integer> listTMP = new ArrayList<Integer>();
		int count = 0;
		for(int i = 0; i < list.size() && count <= p; i++) {
			if(list.get(i) > n) {
				listTMP.add(list.get(i));
				count++;
			}
		}
		PriorityQueue<Integer> listAns = new PriorityQueue<Integer>();
		
		for(int i = 0; i < listTMP.size(); i++) {
			for(int j = i; j < listTMP.size(); j++) {
				listAns.add(listTMP.get(i) + listTMP.get(j));
			}
		}
		for(int i = 0; i < p-1; i++) {
			
			int tmp = listAns.poll();
		}
		return listAns.poll();
		
	}
	
}