import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int[] tmp = new int[2];
			tmp[0] = in.nextInt();
			tmp[1] = in.nextInt();
			list.add(tmp);
		}
		list.sort((s,t)->s[0]-t[0]);
		long ans = 0;
		int i = 0;
		while(m>0) {
			int[] tmp = list.get(i);
			ans += (long)tmp[0] * Math.min(m, tmp[1]);
			m -= tmp[1];
			i++;
		}
		System.out.println(ans);
		in.close();
	}

}
