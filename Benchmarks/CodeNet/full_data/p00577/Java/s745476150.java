import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		List<Character> list = new ArrayList<Character>();
		char[] C = S.toCharArray();
		for (int i = 0; i < N; i++) {
			list.add(C[i]);
		}
		int count = 0;
		for (int i = 0; i < N-1;i++) {
			if (!(list.get(i).equals(list.get(i + 1)))){
				count++;
				i++;
			}
		}
		System.out.println(count);
		sc.close();

	}
}

