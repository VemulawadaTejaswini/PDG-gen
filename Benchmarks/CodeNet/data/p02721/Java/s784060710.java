import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class FenwickTree {
	    int n;
	    int x[];
	    public FenwickTree(int N) {
	    	this.n = N;
	    	x = new int[N + 1] ;
		}
	    int size()  { return n; }
	    int max(int r) {
	        int S = 0;
	        for (r = r - 1; r >= 0; r = (r & (r + 1)) - 1) {
	        	S = Math.max(S,  x[r]);
	        }
	        return S;
	    }
	    void update(int k, int a) {
	        for (; k < n; k |= k + 1) {
	        	x[k] = Math.max(x[k], a);
	        }
	    }
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int C = sc.nextInt();
		String S = sc.next();
		FenwickTree fw = new FenwickTree(N);
		List<Integer> workDays = new ArrayList<Integer>();
		for(int i = 0 ; i < S.length() ; ++i){
			int maxWork = i >= 1 ? fw.max(i - 1) : 0;
			if(S.charAt(i) == 'o'){
				int maxWork2 = i >= C ? fw.max(i - C) : 0;
				fw.update(i, Math.max(maxWork, maxWork2 + 1));
				workDays.add(i + 1);
			}else{
				fw.update(i, maxWork);
			}
		}
		Collections.reverse(workDays);
		int currentDay = workDays.get(0);
		int leftWork = K;
		List<Integer> mustDays = new ArrayList<Integer>();
		for(int i = 0 ; i < workDays.size() ; ++i){
			int wd = workDays.get(i);
			if(wd > currentDay){
				continue;
			}
//			System.out.println(leftWork+" "+currentDay+" "+wd+" "+ fw.max(wd - 1));
			int ni = fw.max(wd - 1);
			if(ni < leftWork){
				mustDays.add(wd);
				leftWork--;
				currentDay = wd - C - 1;
			}else{
				leftWork--;
				currentDay = wd - C - 1;
			}
			if(leftWork <= 0){
				break;
			}
		}
		Collections.reverse(mustDays);
		for(int w : mustDays){
			System.out.println(w);
		}
	}
}
