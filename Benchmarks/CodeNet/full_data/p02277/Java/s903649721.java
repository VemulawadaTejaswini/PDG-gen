import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	
	String[] card;
	int[] num;
	int[] stable;
	int flag = 1;
	
	public void input() {
		n = sc.nextInt();
		card = new String[n];
		num = new int[n];
		stable = new int[n];
		
		for(int i=0; i<n; i++) {
			card[i] = sc.next();
			num[i] = sc.nextInt();
			stable[i] = i;
		}
	}
	
	public void quickSort(int[] A, int n, int p, int r) {
		int q;
		if(p < r) {
			q = partition(A, n, p, r);
			quickSort(A, n, p, q-1);
			quickSort(A, n, q+1, r);
		}
	}
	
	public int partition(int[] A, int n, int p, int r) {
		int x = A[r];
		int work = p - 1;
		for(int j=p; j<r; j++) {
			if(A[j] <= x) {
				work++;
				exchange(A, work, j);
			}
		}
		exchange(A, work+1, r);
		return work+1;
	}
	
	public void exchange(int[] A, int x, int y) {
		int swap = A[x];
		A[x] = A[y];
		A[y] = swap;
		
		String change = card[x];
		card[x] = card[y];
		card[y] = change;
		
		swap = stable[x];
		stable[x] = stable[y];
		stable[y] = swap;
	}

	public void solve() {
		for(int i=0; i<n-1; i++) {
			if(num[i] == num[i+1]) {
				if(stable[i] > stable[i+1]) flag = 0;
			}
		}
	}

	public void output() {
		quickSort(num, n, 0 , n-1);
		solve();
		if(flag == 1) System.out.println("Stable");
		else System.out.println("Not stable");
		for(int i=0; i<n; i++) { System.out.println(card[i]+" "+num[i]); }
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

