import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long x = in.nextInt();
		long[] b = new long[n];
		long[] l = new long[n];
		long[] u = new long[n];
		long B = 0;
		for(int i=0;i<n;i++) {
			b[i] = in.nextInt();
			l[i] = in.nextInt();
			u[i] = in.nextInt();
			B += b[i] * l[i];
		}
		List<long[]> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			long[] tmp = new long[3];
			tmp[0] = i;
			tmp[1] = l[i]*b[i] + u[i]*(x-b[i]);
			list.add(tmp);
		}
		list.sort((e1,e2)->e1[1]>e2[1]?-1:1);
		long ans = 0;
		int idx = 0;
		while(idx<n&&B>list.get(idx)[1]) {
			B -= list.get(idx)[1];
			list.get(idx)[2] = x;
			ans += x;
			idx++;
		}
		for(;idx<n;idx++) {
			long[] tmp = list.get(idx);
			if(tmp[1]<B) {
				tmp[2] = x;
			}else if(B<b[(int) tmp[0]]*l[(int) tmp[0]]) {
				tmp[2] = B/l[(int) tmp[0]];
				tmp[2] += B%l[(int) tmp[0]]==0?0:1;
			}else {
				tmp[2] = b[(int) tmp[0]] + (B-b[(int) tmp[0]]*l[(int) tmp[0]])/u[(int) tmp[0]];
				tmp[2] += (B-b[(int) tmp[0]]*l[(int) tmp[0]])%u[(int) tmp[0]]==0?0:1;
			}
		}
		list.sort((e1,e2)->e1[2]<e2[2]?-1:1);
		ans += list.get(0)[2];
		System.out.println(ans);
		in.close();

	}

}
