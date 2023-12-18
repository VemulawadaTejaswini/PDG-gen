import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int[] tmp = new int[2];
			tmp[0] = in.nextInt();
			tmp[1] = in.nextInt();
			list.add(tmp);
		}
		list.sort((a,b)->(-a[1]+b[1]));
		boolean[] used = new boolean[100001];
		long[] ans = new long[100001];
		long tmp_ans = 0;
		int num_variation = 0;
		Queue<int[]> p_que = new PriorityQueue<>((a,b)->(a[1]-b[1]));
		for(int i=0;i<k;i++) {
			tmp_ans += list.get(i)[1];
			if(used[list.get(i)[0]]==false) {
				used[list.get(i)[0]] = true;
				num_variation++;
			}else {
				p_que.add(list.get(i));
			}
		}
		ans[num_variation] = tmp_ans;
		int i = k;
		while(i<n) {
			if(used[list.get(i)[0]]==false) {
				if(p_que.isEmpty()) break;
				else {
					tmp_ans = tmp_ans - p_que.poll()[1] + list.get(i)[1];
					used[list.get(i)[0]] = true;
					num_variation++;
					ans[num_variation] = tmp_ans;
				}
			}else {
				//continue
			}
			i++;
		}
		long max = 0;
		for(i=0;i<=num_variation;i++) {
			if(ans[i]==0) continue;
			else {
				max = Math.max(max, ans[i] + (long)i*(long)i);
			}
		}
		System.out.println(max);
		in.close();
		
	}

}
