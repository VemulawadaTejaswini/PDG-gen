import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Work[] w = new Work[n];
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			w[i] = new Work(a, b);
		}
		if(new Main().solve(n,w)) System.out.println("Yes");
		else System.out.println("No");
		sc.close();

	}
	boolean solve(int n, Work[] w){
		Arrays.sort(w);
		int time = 0;
		for(Work work : w){
			time += work.A;
			if(time > work.B) return false;
		}
		return true;
	}
}

class Work implements Comparable<Work>{
	public int A; //かかる時間
	public int B; //締め切り時刻
	public Work(int A, int B){
		this.A = A;
		this.B = B;
	}
	@Override
	public int compareTo(Work o) {
		//締め切り時刻順にする
		return this.B - o.B;
	}	
}