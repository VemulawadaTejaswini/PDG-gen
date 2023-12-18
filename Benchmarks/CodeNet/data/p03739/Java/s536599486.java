import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Sequence solver = new Sequence();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}


	static class Sequence {
		private int n;
		private long a[];

		private long output;
		private Scanner scanner;

		public Sequence() {
			this.scanner = new Scanner(System.in);
		}

		public void readInput() {
			n = Integer.parseInt(scanner.next());
			a = new long[n];
			for(int i=0; i<n; i++) {
				a[i] = Integer.parseInt(scanner.next());
			}
		}

		private int count(int sign) {
			int count=0;
			long sum=0;
			for(int i=0; i<n; i++) {
				sum += a[i];
				if(i%2==sign) {
					// a[i]までの合計を正にするとき
					if(sum<=0) {
						count += 1-sum;
						sum = 1;
					}
				} else {
					// a[i]までの合計を負にするとき
					if(0<=sum) {
						count += 1+sum;
						sum = -1;
					}
				}
			}
			return count;
		}

		public void solve() {
			long sum1 = 0;
			long count1 = 0;
			long sum2 = 0;
			long count2 = 0;
			for (int i = 0; i < n; i++) {
			    sum1 += a[i];
			    sum2 += a[i];
			    if (i % 2 == 1) {
			        if (sum1 <= 0) {
			            count1 += 1 - sum1;
			            sum1 = 1;
			        }
			        if (sum2 >= 0) {
			            count2 += sum2 + 1;
			            sum2 = -1;
			        }
			    } else {
			        if (sum2 <= 0) {
			            count2 += 1 - sum2;
			            sum2 = 1;
			        }
			        if (sum1 >= 0) {
			            count1 += sum1 + 1;
			            sum1 = -1;
			        }
			    }
			}
			output = Math.min(count1,count2);
		}


		public void writeOutput() {
			System.out.println(output);
		}
	}

}