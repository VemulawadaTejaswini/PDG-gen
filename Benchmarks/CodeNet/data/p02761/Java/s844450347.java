import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Keta[] keta = new Keta[m];
		for(int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			keta[i] = new Keta(s, c);
		}
		sc.close();
		Arrays.sort(keta);
		// N桁目の値がない場合は-1
		if(keta[m-1].S != n) {
			System.out.println(-1);
			return;
		}
		int n1 = Integer.MAX_VALUE;
		int n2 = Integer.MAX_VALUE;
		int n3 = Integer.MAX_VALUE;
		for(Keta k : keta) {
			switch (k.S) {
				case 3:
					n3 = Math.min(n3, k.C);
					break;
				case 2:
					n2 = Math.min(n2, k.C);
					break;
				case 1:
					n1 = Math.min(n1, k.C);
					break;
				default:
					break;
			}
		}
		n1 = n1 == Integer.MAX_VALUE ? 0 : n1;
		n2 = n2 == Integer.MAX_VALUE ? 0 : n2;
		n3 = n3 == Integer.MAX_VALUE ? 0 : n3;
		System.out.println(n1 + "" + n2 + "" + n3);
	}
}

class Keta implements Comparable<Keta>{
	public int S; 
	public int C;
	public Keta(int S, int C){
		this.S = S;
		this.C = C;
	}
	@Override
	public int compareTo(Keta o) {
		return this.S - o.S;
	}	
}