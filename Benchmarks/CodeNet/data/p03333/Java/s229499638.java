import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] LR = new int[N][2];
		for(int i=0;i<N; i++) {
			LR[i][0] = in.nextInt();
			LR[i][1] = in.nextInt();
		}
		
		ArrayList<Range> list = new ArrayList<>();
		for(int i=0;i<N; i++) {
			list.add(new Range(LR[i][0],LR[i][1]));
		}
		long sum1 = game(list,true);
		
		list = new ArrayList<>();
		for(int i=0;i<N; i++) {
			list.add(new Range(LR[i][0],LR[i][1]));
		}
		long sum2 = game(list,false);
		System.out.println(Math.max(sum1,sum2));
		
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	public long game(ArrayList<Range> list, boolean toRight) {
			int base = 0;
			long sum = 0;
			while(!list.isEmpty()) {
				int distance;
				int nextBase;
				if(toRight) {
					list.sort((a,b)->b.left-a.left);
					nextBase = list.get(0).left;
					distance = nextBase-base;
				}else{
					list.sort((a,b) -> a.right-b.right);
					nextBase = list.get(0).right;
					distance = base-nextBase;
				}
				if(distance<0) break;
				sum += distance;
				base = nextBase;
				toRight = !toRight;
				list.remove(0);
			}
			return sum + Math.abs(base);	
	}
	
	class Range{
		int left;
		int right;
		
		public Range(int left, int right) {
			this.left = left;
			this.right = right;
		}
	}
}
