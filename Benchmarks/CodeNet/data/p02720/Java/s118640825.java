import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		//今回のIdxは1から始まる
		int idx = scanner.nextInt();
		scanner.close();

		Deque<Long> lunlunQue = new ArrayDeque<>();

		for(Long i=(long) 1; i < 10; i++) {
			lunlunQue.add(i);
		}

		Long num = (long) 0;

		for(int i=0; i < idx; i++) {
			num = lunlunQue.poll();
//			System.out.println(num);
			if(num%10 != 0) {
				lunlunQue.add(num*10+num%10-1);
			}
			lunlunQue.add(num*10+num%10);
			if(num%10!=9) {
			lunlunQue.add(num*10+num%10+1);
			}
		}

		System.out.println(num);

	}

}
