import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String ary[][] = new String[N][3];
		for(int i = 0; i < N; i++) {
			ary[i][0] = sc.next();
			ary[i][1] = sc.next();
			ary[i][2] = i + "";
		}
		
		Arrays.sort(ary, (a, b) -> Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));
		Arrays.sort(ary, (a, b) -> a[0].compareTo(b[0]));
		for(int i = 0; i < N; i++) {
			System.out.println(Integer.parseInt(ary[i][2]) + 1);
		}
	}
}