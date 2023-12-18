import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long[] b = new long[n];

		for(int i=0;i<n;i++) {
			a[i]=Long.parseLong(sc.next());
		}
		for(int i=0;i<n;i++) {
			b[i]=Long.parseLong(sc.next());
		}
		sc.close();

		List<Long> plus = new ArrayList<Long>();
		long sum = 0;
		int num = 0;

		for(int i=0;i<n;i++) {
			long dif = a[i] - b[i];
			if(dif < 0) {sum -= dif;num++;}
			else plus.add(dif);
		}
		if(num == 0) {System.out.println(0);return;}

		int res = num;

		Collections.sort(plus,Collections.reverseOrder());

		long p=0;
		for (int i = 0; i < plus.size(); i++) {
            p += plus.get(i);
            res++;
            if (p >= sum) break;
        }

		if (p >= sum) System.out.println(res);
        else System.out.println(-1);

	}

}