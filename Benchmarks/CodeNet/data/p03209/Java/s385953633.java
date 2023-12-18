import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		long x = sc.nextLong();
		long p[] = makeNumOfPatty(n);
		long bp[] = makeLenOfBg(n);
		long sum = 0;
		for(int i = n; i >= 0; i--) {
			if(bp[i] <= x) {
				sum += p[i];
				x -= bp[i];
				//System.out.println(i+" "+x + " " + sum);
				if(x > 0) { 
					x--;
					sum++;
					//System.out.println(i+" "+x + " " + sum);
				}
				if(bp[i] <= x) {
					sum += p[i];
					x -= bp[i];
					if(x > 0) { 
						x--;
						sum++;
						//System.out.println(i+" "+x + " " + sum);
					}
				}
			}
			
			x--;
			
			if(x == 0)break;
		}
		//System.out.println(Arrays.toString(p));
		//System.out.println(Arrays.toString(bp));
		//System.out.println(x);
		System.out.println(sum);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}
	long[] makeNumOfPatty(int n) {
		long ans[] = new long[n + 1];
		ans[0] = 1;
		for(int i = 1; i <= n; i++) {
			ans[i] = ans[i - 1] * 2 + 1;
		}
		return ans;
	}
	long[] makeLenOfBg(int n) {
		long ans[] = new long[n + 1];
		ans[0] = 1;
		for(int i = 1; i <= n; i++) {
			ans[i] = ans[i - 1] * 2 + 3;
		}
		return ans;
	}

}
