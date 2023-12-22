import java.util.Arrays;
import java.util.Scanner;

//Rabbit Plays Games!
public class Main{

	class R implements Comparable<R>{
		int damage, turn;
		public R(int damage, int turn) {
			this.damage = damage;
			this.turn = turn;
		}
		public int compareTo(R o) {
			return turn!=o.turn?turn-o.turn:o.damage-damage;
//			return damage!=o.damage?o.damage-damage:turn-o.turn;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int HP = sc.nextInt(), A = sc.nextInt(), D = sc.nextInt(), S = sc.nextInt();
		R[] r = new R[n];
		boolean f = false;
		long res = 0;
		for(int i=0;i<n;i++){
			int hp = sc.nextInt(), a = sc.nextInt(), d = sc.nextInt(), s = sc.nextInt();
			if(S<s)res+=Math.max(0, a-D);
			if(A<=d){
				f = true; continue;
			}
			r[i] = new R(Math.max(0, a-D), (hp-1)/(A-d)+1);
		}
		if(f){
			System.out.println(-1); return;
		}
		Arrays.sort(r);
		long T = 0;
		for(R v:r){
			T+=v.turn;
			res+=(T-1)*v.damage;
		}
		System.out.println(HP<=res?"-1":res);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}