import java.util.Scanner;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		int N, cnt = 0;
		String hin;
		Scanner scan = new Scanner(System.in);
		N= scan.nextInt();
		
		HashSet name = new HashSet();
		
		for(int i = 1; i <= N; i++) {
			hin = scan.next();
			name.add(hin);
		}
		System.out.println(name.size());
	}

}
