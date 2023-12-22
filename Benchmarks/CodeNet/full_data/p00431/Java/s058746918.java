import java.util.Scanner;

public class Main {
	private int[][] thread;
	private boolean[] used;
	private static int sum_ = 0;
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			thread = new int[n][2];
			used = new boolean[n];
			for (int i = 0; i < n; i++) {
				thread[i][0] = scan.nextInt();
				thread[i][1] = scan.nextInt();
				this.used[i] = false;
			}
			sum_ = 0;
			comb(n);
			
			System.out.println(sum_);
			n = scan.nextInt();
		}
	}
	
	private void comb(int n){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				initUsed(n);
				this.used[i] = true;
				//System.out.print(this.thread[i][0]+":"+this.thread[i][1]+" "+1+"→");
				seekComb(this.thread[i][j], n, 1);
			}
		}
	}
	
	private void seekComb(int ringNum, int n, int count){
		boolean [] stuck = new boolean[n];
		for (int p = 0; p < n; p++) {
			for (int q = 0; q < 2; q++) {
				if (!this.used[p] && this.thread[p][q] == ringNum) {
					this.used[p] = true;
					for (int i = 0; i < n; i++) {
						for (int j = 0; j < 2; j++) {
							if (i != p && this.thread[i][j] == this.thread[p][q] && !this.used[i]) {
								this.used[i] = true;
								stuck[i] = true;
							}else {
								stuck[i] = false;
							}
						}
					}
					count++;
					if (q == 0) {
						//System.out.print(this.thread[p][0]+"-"+this.thread[p][1]+":"+count+"→");
						seekComb(this.thread[p][1], n, count);
						sum_ = Math.max(sum_, count);
						count--;
					}else {
						//System.out.print(this.thread[p][1]+"-"+this.thread[p][0]+":"+count+"→");
						seekComb(this.thread[p][0], n, count);
						sum_ = Math.max(sum_, count);
						count--;
					}
					for (int i = 0; i < n; i++) {
						if (stuck[i]) {
							this.used[i] = false;
							stuck[i] = false;
						}
					}
				}
			}
		}
		//System.out.println();
		
	}
	
	private void initUsed(int n){
		for (int i = 0; i < n; i++) {
			this.used[i] = false;
		}
	}

}