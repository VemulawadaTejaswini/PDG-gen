import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		ArrayList<Integer> a_odd = new ArrayList<Integer>();
		ArrayList<Integer> a_even = new ArrayList<Integer>();
		for(int i = 0;i < n;i ++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i = 1;i < n;i ++) {
			if(i % 2 == 0) a_even.add(a[i]);
			else a_odd.add(a[i]);
		}
		int oddmax = a_odd.size()-1,oddmin = 0;
		int evenmax = a_even.size()-1,evenmin = 0;
		int sum = 0,cnt = 0;
		while(oddmax > 0) {
			sum += a_odd.get(oddmax) - a_odd.get(oddmin);
			//System.out.println(a_odd.get(oddmax)+"-"+a_odd.get(oddmin));
			if(cnt % 2 == 0) oddmax--;
			else oddmin++;
			cnt++;
		}
		cnt = 0;
		while(evenmax > 0) {
			sum += a_even.get(evenmax) - a_even.get(evenmin);
			if(cnt % 2 == 0) evenmax--;
			else evenmin++;
			cnt++;
		}
		sum += a_odd.get(a_odd.size()-1) - a[0];
		sum += a_even.get(a_even.size()-1) - a[0];
		System.out.println(sum);
	}
}