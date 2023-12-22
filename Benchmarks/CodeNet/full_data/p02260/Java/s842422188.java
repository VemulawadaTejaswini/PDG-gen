import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		List<Integer> A = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		// BufferedReader br = new BufferedReader(new FileReader("in2.txt"));
		int N = Integer.parseInt(br.readLine());
		String[] s_in = br.readLine().split(" ");
		for (String s : s_in)
			A.add(Integer.parseInt(s));
		
		int cnt_swap = 0;
		for (int i = 0; i < N; i++) {
			// A[0..i-1]??????????????????
			int mini = i;
			for (int j = i + 1; j < N; j++)
				if (A.get(j) < A.get(mini))
					mini = j;
			if (mini != i) {
				int tmp = A.get(i);
				A.set(i, A.get(mini));
				A.set(mini, tmp);
				cnt_swap++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int n : A) {
			sb.append(n);
			sb.append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append('\n');
		sb.append(cnt_swap);
		System.out.println(sb);
	}
}