import java.util.*;

public class Main {
	private int[] trarray = new int[3];
	private int minDiv;

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		Main soln = new Main();
		soln.minDiv = m*n;
		int[] temp = new int[3];
		for(int i=1; i<=m/2; i++) {
			temp[0] = i*n;
			soln.digR(temp, m-i, n);
			soln.digC(temp, m-i, n);
		}
		for(int i=1; i<=n/2; i++) {
			temp[0] = i*m;
			soln.digR(temp, m, n-i);
			soln.digC(temp, m, n-i);
		}
		System.out.println(soln.minDiv);
	}

	private void digR(int[] temp, int m, int n) {
		int div;
		int j = m/2;
		temp[1] = j*n;
		temp[2] = (m-j)*n;
		this.trarray = Arrays.copyOf(temp, temp.length);
		Arrays.sort(this.trarray);
		div = this.trarray[2] - this.trarray[0];
		this.minDiv = (div<this.minDiv)? div:minDiv;
	}

	private void digC(int[] temp, int m, int n) {
		int div;
		int j = n/2
		temp[1] = j*m;
		temp[2] = (n-j)*m;
		this.trarray = Arrays.copyOf(temp, temp.length);
		Arrays.sort(this.trarray);
		div = this.trarray[2] - this.trarray[0];
		this.minDiv = (div<this.minDiv)? div:minDiv;
	}
}