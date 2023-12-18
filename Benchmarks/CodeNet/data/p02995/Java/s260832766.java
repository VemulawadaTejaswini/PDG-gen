import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		
		ArrayList<Long> c = new ArrayList<Long>();
		ArrayList<Long> d = new ArrayList<Long>();
		ArrayList<Long> cd = new ArrayList<Long>();
		int count = 1;
		long Ca = 0;
		long Da = 0;
		while (true) {
			Ca = C * count;
			if (Ca > B){
				break;
			}
			if (Ca >= A){
				c.add(Ca);
			}
			count++;
		}
		count = 1;
		while (true) {
			Da = D * count;
			if (Da > B){
				break;
			}
			if (Da >= A){
				d.add(Da);
			}
			count++;
		}
		for (long i : c) {
			if (!cd.contains(i)){
				cd.add(i);
			}
		}
		for (long i : d) {
			if (!cd.contains(i)){
				cd.add(i);
			}
		}
		System.out.println(B-A+1-cd.size());
	}		
}
