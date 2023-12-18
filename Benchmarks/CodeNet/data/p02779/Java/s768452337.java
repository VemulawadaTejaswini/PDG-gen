import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		int n = sc.nextInt();

		HashSet<Integer> set = new HashSet<>();

		for(int i=0;i<n;i++) {
			set.add(sc.nextInt());
		}

		if(set.size() == n) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

//		System.out.println();



	}
}
