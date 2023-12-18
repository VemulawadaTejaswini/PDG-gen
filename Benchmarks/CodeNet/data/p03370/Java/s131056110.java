import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int m_sum = 0;
		int m_min = Integer.MAX_VALUE;

		List<Integer> M = new ArrayList<Integer>();
		for(int i=0; i<N; i++){
			int m = Integer.parseInt(sc.next());
			m_sum += m;
			M.add(m);
			m_min = m_min > m ? m:m_min;
		}
		System.out.println(N + (X - m_sum)/m_min);
	}
}