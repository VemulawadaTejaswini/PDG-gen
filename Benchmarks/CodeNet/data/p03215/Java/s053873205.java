import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int a[] = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(sc.next());
			sum += a[i];
		}
		
		if(K == 1) {
			System.out.println(sum);
			return;
		}
		
		int num = 2;
		int pre = 0;
		int c = 1;
		while(Math.pow(num, c + 1) < sum) {
			c++;
		} 
		num = (int)Math.pow(2, c);
		pre = (int)Math.pow(2, c + 1);
		
		boolean flag = true;
		int loop = 0;
		while(flag) {
			flag = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(sum);
		int sum_left = sum;
		int sum_right = sum;
		int cnt = 0;
		while(sum_left - a[cnt] >= num && sum_left < pre) {
			sum_left -= a[cnt];
			list.add(sum_left);
			cnt++;
		}
		cnt = 0;
		while(sum_right - a[N - 1 - cnt] >= num && sum_right < pre) {
			sum_right -= a[N - 1 - cnt];
			list.add(sum_right);
			cnt++;
		}
		
		Collections.sort(list, Comparator.reverseOrder());
		
		/*if(list.size() < K) {
			flag = true;
			loop++;
			pre = num;
			num = (int)Math.pow(num, c - loop);
			continue;
		}
		
		int n[][] = new int[list.size()][c - loop];
		int n_temp[] = new int[c - loop];
		for(int i = 0; i < list.size(); i++) {
			String temp = Integer.toBinaryString(list.get(i));
			for(int j = 0; j < c - loop; j++) {
				if(temp.substring(j, j + 1).equals("1")) {
					n[i][j] = 1;
					n_temp[j]++;
				} else {
					n[i][j] = 0;
				}
			}
		}
		
		int n_t = 0;
		for(int i = 1; i < c - loop; i++) {
			if(n_temp[i] > K) {
				n_t = i;
				break;
			}
		}
		
		ArrayList<Integer> prelist = new ArrayList<Integer>();
		prelist = (ArrayList<Integer>) list.clone();
		while(n_t < c - loop) {
			ArrayList<Integer> nowlist = new ArrayList<Integer>();
			
			for(int i = 0; i < prelist.size(); i++) {
				if(Integer.toBinaryString(list.get(i)).substring(n_t, n_t + 1).equals("1")) {
					nowlist.add(list.get(i));
				}
			}
			if(nowlist.size() < K) {
				n_t++;
				continue;
			}
			
			prelist = (ArrayList<Integer>) nowlist.clone();
			n_t++;
		}*/
		
		int ans = list.get(0);
		for(int i = 1; i < K; i++) {
			ans &= list.get(i);
		}
		
		System.out.println(ans);
		return;
		}
	}
}
