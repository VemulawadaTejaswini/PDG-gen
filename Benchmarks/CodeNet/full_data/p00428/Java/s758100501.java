import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Counter {
	int n, m;
	int count[] = null;
	Counter(int n, int m) {
		this.n = n;
		this.m = m;
		this.count = new int[m];
	}

	public void count(String line) {
		StringTokenizer st = new StringTokenizer(line, " ");
		for (int i=0;i<m;i++) {
			if (Integer.parseInt(st.nextToken())==1) {
				count[i]++;
			}
		}
	}

	public void printRanking() {
		String rank = "";
		for (int i=this.n;i>=0;i--) {
			for (int j=0;j<this.m;j++) {
				if (count[j]==i) {
					rank += (Integer.toString(j+1)+" ");
				}
			}
		}
		System.out.println(rank.substring(0, 2*this.m-1));
	}

	public void printCounter() {
		for (int i=0;i<this.m-1;i++) {
			System.out.print(count[i]+" ");
		}
		System.out.println(count[this.m-1]);
	}
}

class Main {
    public static void main(String args[]) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
        try {
            String buf = null;
            int n, m;
			Counter cnt = null;
            while (!(buf = br.readLine()).equals("0 0")) {
				StringTokenizer st = new StringTokenizer(buf, " ");
				n = Integer.parseInt(st.nextToken());
				cnt = new Counter(n, Integer.parseInt(st.nextToken()));
				for (int i=0;i<n;i++) {
					cnt.count(br.readLine());
				}
				//cnt.printCounter();
				cnt.printRanking();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}