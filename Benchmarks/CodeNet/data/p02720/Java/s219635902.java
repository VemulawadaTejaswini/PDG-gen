import java.util.*;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int num = 0;
		
		Deque<Integer> lunlun = new ArrayDeque<Integer>(10);
		
		for(int i = 1; i <=10; i++) {
			lunlun.add(i);
		}
			
		for(int i = 0; i < K; i++) {
			num = lunlun.pollFirst();
			
			if (num%10 != 1) {
				lunlun.add((num*10) + (num%10) - 1);
			}
			
			lunlun.add((num*10) + (num%10));
			
			if (num%10 != 9) {
				lunlun.add((num*10) + (num%10) + 1);
			}
		}
		System.out.println(num);
		
	}
}
