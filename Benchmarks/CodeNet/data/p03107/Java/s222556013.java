import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		Deque<Integer> deq = new ArrayDeque<Integer>();
		int i = 1; int count = 1;
		while(i<s.length) {
			while(s[i]==s[i-1]) {
				count++;
				i++;
				if(i==s.length)break;
			}
			i++;
			deq.addLast(count);
			count = 1;
		}
		int ans = deq.isEmpty()?1:deq.pollFirst();
		while(!deq.isEmpty()) {
			ans = deq.pollFirst()-ans;
		}
		System.out.println(s.length-Math.abs(ans));
		sc.close();
	}
}