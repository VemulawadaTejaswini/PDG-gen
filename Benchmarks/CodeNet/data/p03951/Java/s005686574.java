import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		sc.close();
		StringBuffer sb = new StringBuffer();
		int i=0, j, count = 0, first = 0;
		for (j = 0; j < N; j++) {
			if (s.charAt(j) == t.charAt(i)&&count != N) {
				count++; //check next;
				if (count == 1)
					first = j;
				i++;
			} else {
			 if (count != 0 && j!=N-1)
				count = 0;//reset count = 0;
			}
		}
		if (count == 0)
			sb.append(s+t);
		else
			sb.append(s.substring(0,first)+t);
		System.out.println(sb);
	}
}