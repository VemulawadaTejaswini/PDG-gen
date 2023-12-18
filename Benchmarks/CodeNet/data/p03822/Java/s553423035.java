import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person[] arr = new Person[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = new Person();
		}
		for (int i = 2; i <= n; i++) {
			int x = sc.nextInt();
			arr[i].lose = x;
			arr[x].add(i);
		}
		setCount(arr, 1, 0);
		int max = 0;
		for (int i = 1; i <= n; i++) {
			max = Math.max(max, arr[i].getCount());
		}
		System.out.println(max);
	}
	
	static void setCount(Person[] arr, int idx, int count) {
		arr[idx].count = count;
		for (int x : arr[idx].wins) {
			setCount(arr, x, count + 1);
		}
	}
	
	static class Person {
		int lose = 0;
		ArrayList<Integer> wins = new ArrayList<>();
		int count = 0;
		
		public void add(int x) {
			wins.add(x);
		}
		
		public int getCount() {
			return count + wins.size();
		}
		
		public String toString() {
			return "lose:" + lose + " count:" + count + " size:" + wins.size();
		}
	}
}
