import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long a = 1, b = 0, c = 0, d = 0;
		while(true) {
			a *= 26;
			b += a;
			d++;
			if(b == N) {
				for(int i = 0; i < d; i++)
					System.out.print("z");
				return;
			}
			if(b >= N)
				break;
			c += a;
		}
		N -= c;
		List<Integer> l = new ArrayList<>();
		for(int i = 0; i < d; i++) {
			l.add((int)(N % 26));
			N /= 26;
		}
		for(int i = l.size()-1; i >= 1; i--) {
			System.out.print((char)(l.get(i) + 'a'));
		}
		if(l.get(0) == 0)
			System.out.println("z");
		else
			System.out.println((char)(l.get(0) + 'a' - 1));
	}

}