import java.util.*;
public class Main {
	static final int team = 3;
	static final int player = 8;
	
	public static void Swap(Player[] a, int r, int c) {
		Player temp = a[r];
		a[r] = a[c];
		a[c] = temp;
		temp = null;
		//System.out.println("Swapped");
	}
	
	public static void SortOneDimention(Player[] ary) {
		for(int r = 0; r < player - 1; r++) {
			for(int c = ary.length - 1; c > r; c--) {
				if(ary[c - 1].getTime() > ary[c].getTime())
					Swap(ary, c - 1, c);
			}
		}
	}
	
	public static void Sort(Player[][] judge) {
		for(int r = 0; r < team; r++) {
			SortOneDimention(judge[r]);
		}
		//System.out.println("OneDimention");
	}
	
	public void doIt() {
		Scanner stdIn = new Scanner(System.in);
		Player[][] judge = new Player[3][8];
		
		for(int r = 0; r < team; r++) {             //データ読み込み
			for(int c = 0; c < player; c++) {
				int number = stdIn.nextInt();
				double time = stdIn.nextDouble();
				judge[r][c] = new Player(number, time);
			}
		}
		//System.out.println("BEFORE SORT SUBROUTINE");
		
		Sort(judge); //諸悪の根源
		//System.out.println("judge is sorted.");
		
		Player[] temp = new Player[18];
		int count = 0;
		for(int r = 0; r < team; r++) {
			for(int c = 2; c < player; c++) {
				temp[count++] = judge[r][c];
			}
			//System.out.println("r is " + r);
		}
		SortOneDimention(temp);
		
		for(int r = 0; r < team; r++) {
			for(int c = 0; c < 2; c++) {
				System.out.println(judge[r][c].getNumber() + " " + judge[r][c].getTime());
			}
		}
		for(int r = 0; r < 2; r++) {
			System.out.println(temp[r].getNumber() + " " + temp[r].getTime());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

	class Player {
		private int number;
		private double time;
		
		public Player(int number, double time) {
			this.number = number;
			this.time = time;
		}
		
		public int getNumber() {
			return(number);
		}
		public double getTime() {
			return(time);
		}
		
		public void setNumber(int number) {
			this.number = number;
		}
		public void setTime(double time) {
			this.time = time;
		}
	}
	
}