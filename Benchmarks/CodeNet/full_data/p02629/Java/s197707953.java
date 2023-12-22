import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		List<Integer> l = new ArrayList<>();
		while(true) {
			l.add((int)(N % 26));
			N /= 26;
			if(N < 26)
				break;
		}
		for(int i = l.size()-1; i >= 0; i--) {
			if(l.get(i) == 0)
				System.out.print("z");
			else
				System.out.print((char)(l.get(i) + 96));
		}
	}

}