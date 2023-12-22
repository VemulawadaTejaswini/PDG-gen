//package TrackAndFieldCompetition;
import java.util.*;
public class Main {
	class Kiroku implements Comparable<Kiroku> {
		int number;
		Double time;
		Kiroku(int number, Double time) {
			this.number = number;
			this.time = time;
		}
		@Override
		public int compareTo(Kiroku k) {
			return time.compareTo(k.time);
		}
		@Override
		public String toString() {
			return number + " " + time;
		}
		
	}
	
	static void senshutsuIn(Kiroku[][] t, Kiroku[] h, Kiroku[] s) {
		int sidx = 0;
		int hidx = 0;
		for(int i = 0; i < 3; i++) {
			s[sidx] = t[i][0];
			sidx++;
			s[sidx] = t[i][1];
			sidx++;
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 2; j < 8; j++) {
				h[hidx] = t[i][j];
				hidx++;
			}
		}
	}
	
	static void haisyaIn(Kiroku[] s, Kiroku[] h) {
		s[6] = h[0];
		s[7] = h[1];
	}
	
	//??¨24??? 1???8??? ?¨?3??? ????????????2??????????????? ??????????????????2?????????
	void doIt() {
		Scanner sc = new Scanner(System.in);
		Kiroku[][] table = new Kiroku[3][8];
		Kiroku[] haisya = new Kiroku[18];
		Kiroku[] senshutsu = new Kiroku[8];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 8; j++) {
				table[i][j] = new Kiroku(sc.nextInt(), sc.nextDouble());
			}
		}
		Arrays.sort(table[0]); Arrays.sort(table[1]); Arrays.sort(table[2]);
		senshutsuIn(table, haisya, senshutsu);
		Arrays.sort(haisya);
		haisyaIn(senshutsu, haisya);
		for(int i = 0; i < 8; i++) {
			System.out.println(senshutsu[i].toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}