import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Robo[] r = new Robo[n];
		for(int i = 0 ; i < n ; i++) {
			r[i] = new Robo(sc.nextInt() ,sc.nextInt());
		}
		Arrays.sort(r);
		int count = 0;
		int now = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++) {
			Robo r2 = r[i];
			if(r2.x - r2.l >= now) {
				count++;
				now = r2.x + r2.l;
			}
		}

		sc.close();
		System.out.println(count);

	}
}
class Robo implements Comparable<Robo>{
	public Robo(int x , int l) {
		this.x = x;
		this.l = l;
	}
	int x,l;
	@Override
	public int compareTo(Robo r) {
		return (this.x + this.l) - (r.x + r.l);
	}
}

