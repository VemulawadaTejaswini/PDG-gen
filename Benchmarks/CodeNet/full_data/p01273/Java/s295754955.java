import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		MyComp comp = new MyComp();
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n == 0 && m == 0) break;
			ArrayList<Data> list = new ArrayList<Data>();
			boolean[] infected = new boolean[n+1];
			infected[1] = true;
			for(int i = 0; i < m; i++) {
				int t = stdIn.nextInt();
				int s = stdIn.nextInt();
				int d = stdIn.nextInt();
				list.add(new Data(t,s,d));
			}
			Collections.sort(list,comp);
			for(int i = 0; i < m; i++) {
				Data tmp = list.get(i);
				if(infected[tmp.s]) {
					infected[tmp.d] = true;
				}
			}
			int ans = 0;
			for(int i = 1; i <= n; i++) {
				if(infected[i]) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}

class Data {
	int time;
	int s;
	int d;
	Data(int t, int a, int b) {
		time = t;
		s = a;
		d = b;
	}
}

class MyComp implements Comparator<Data> {
	public int compare(Data o1, Data o2) {
		if(o1.time < o2.time)
			return -1;
		if(o1.time > o2.time)
			return 1;
		return 0;
	}
	
}

	