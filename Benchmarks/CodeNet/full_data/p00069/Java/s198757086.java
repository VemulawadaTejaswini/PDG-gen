import java.util.Scanner;

// Java8
public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() throws Exception {
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			Lots lots = new Lots(d, n);
			for(int y=0; y<d; y++) {
				String row = sc.next();
				for(int x=0; x<n-1; x++) {
					if(row.charAt(x)=='1') {
						lots.putBar(y, x);
					}
				}
			}
			for(int y=0; y<d; y++) {
				for(int x=0; x<n-1; x++) {
					if(lots.noBar(y, x)) {
					}
				}
			}
			if(lots.trace(s-1)==t-1) {
				System.out.println(0);
			} else {
				boolean found = false;
				for(int y=0; y<d; y++) {
					if(!found) {
						for(int x=0; x<n-1; x++) {
							if(lots.noBar(y, x)) {
								Lots copy = lots.clone();
								copy.putBar(y, x);
								if(copy.trace(s-1)==t-1) {
									found = true;
									System.out.println((y+1) + " " + (x+1));
									break;
								}
							}
						}
					}
				}
				if(!found) {
					System.out.println(1);
				}
			}
		}
	}
}
class Lots implements Cloneable{
	int d;
	int n;
	int[][] f;
	Lots(int d, int n) {
		this.d = d;
		this.n = n;
		f = new int[d][n];
		for(int i=0; i<d; i++) {
			for(int j=0; j<n; j++) {
				f[i][j] = j;
			}
		}
	}
	boolean noBar(int y, int x) {
		return f[y][x]==x && f[y][x+1] == x+1;
	}

	void putBar(int y, int x) {
		int t = f[y][x];
		f[y][x] = f[y][x+1];
		f[y][x+1] = t;
	}

	int trace(int x) {
		int res = x;
		for(int[] r : f) {
			res = r[res];
		}
		return res;
	}

	@Override
	public Lots clone()
	{
		Lots r = new Lots(d, n);
		for(int y=0; y<d; y++) {
			for(int x=0; x<n; x++) {
				r.f[y][x] = f[y][x];
			}
		}
		return r;
	}
}
