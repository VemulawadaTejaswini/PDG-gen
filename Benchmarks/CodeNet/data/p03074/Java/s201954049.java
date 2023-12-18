import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		
		List<Integer> list = new ArrayList<>();
		
		int begin = 0;
		char now = '1';
		
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) != now) {
				list.add(i-begin);
				now = s.charAt(i);
				begin = i;
			}
		}
		list.add(n-begin);
		if(now == '0')
			list.add(0);

		int result = 0;
		int sum = 0;
		int left = 0;
		int right = 0;
		for(int i = 0; i < list.size(); i+=2) {
			int nextLeft = i;
			int nextRight = Math.min(i+k*2+1, list.size());
			
			while(nextLeft > left) {
				sum -= list.get(left);
				left++;
			}
			
			while(nextRight > right) {
				sum += list.get(right);
				right++;
			}
			result = Math.max(sum, result);
		}

		System.out.println(result);
	}
}