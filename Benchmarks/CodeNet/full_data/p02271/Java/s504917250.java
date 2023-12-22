import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> A = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			A.add(Integer.parseInt(sc.next()));
		}
		int q = Integer.parseInt(sc.next());
		ArrayList<Integer> m = new ArrayList<>();
		for(int i = 0; i < q; i++) {
			m.add(Integer.parseInt(sc.next()));
		}
		sc.close();
		
		Collections.sort(A);
		
		
		for(int i = 0; i < q; i++) {
			if(solve(A, 0, m.get(i))) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

	public static boolean solve(ArrayList<Integer> data, int i, int m) {
		if(m == 0) return true;
		if(i == data.size() - 1) {
			if(data.get(i) == m) {
				return true;
			}else {
				return false;
			}
		}
		return solve(data, i + 1, m) || solve(data , i + 1 , m -data.get(i));
	}

}
