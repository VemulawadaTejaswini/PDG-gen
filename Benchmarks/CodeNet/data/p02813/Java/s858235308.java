import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N];
		int Q[] = new int[N];
		for (int i=0;i<N;i++) {
			P[i] = sc.nextInt();
		}
		int countP=0;
		int p =0;
		for (int j=0;j<N;j++) {
			p = p *10+P[j];
		}
		for (int i=0;i<N;i++) {
			Q[i] = sc.nextInt();
		}
		int countQ=0;
		int q =0;
		for (int j=0;j<N;j++) {
			q = q *10+Q[j];
		}
		Main main = new Main();
		main.makeArray(N, new int[N], 0);
		for (int i=0;i<main.list.size();i++) {
			if (main.list.get(i)==p) {
				countP =i;
			}
			if (main.list.get(i)==q) {
				countQ =i;
			}
		}
		System.out.println(Math.abs(countP-countQ));
	}

	public void makeArray(int N, int[] array,int now) {
		for (int i=1;i<=N;i++) {
			boolean b =true;
			for (int j=0;j<now;j++) {
				if (array[j]==i) {
					b = false;
					break;
				}
			}
			if (b==true) {
				if (now ==N-1) {
					array[N-1]=i;
					int result = 0;
					for (int j=0;j<N;j++) {
						result = result *10+array[j];
					}
					list.add(result);
				} else {
					array[now]=i;
					makeArray(N,array,now+1);
				}
			}
		}
	}
}