import java.util.*;
public class Main {
	static final int team = 3;
	static final int player = 8;
	
	public void doIt() {
		Scanner stdIn = new Scanner(System.in);
		Player[][] judge = new Player[3][8];
		
		for(int r = 0; r < team; r++) {             //データ読み込み
			for(int c = 0; c < player; c++) {
				int number = stdIn.nextInt();
				String time = stdIn.next();
				judge[r][c] = new Player(number, time);
			}
		}
		for(int r = 0; r < 3; r++)
			Arrays.sort(judge[r]); 
		
		Player[] temp = new Player[18];
		int count = 0;
		for(int r = 0; r < team; r++) {
			for(int c = 2; c < player; c++) {
				temp[count++] = judge[r][c];
			}
		}
		Arrays.sort(temp);
		
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

	class Player implements Comparable<Player>{
		private int number;
		private String time;
		
		public Player(int number, String time) {
			this.number = number;
			this.time = time;
		}
		
		public int getNumber() {
			return(number);
		}
		public String getTime() {
			return(time);
		}
		
		public void setNumber(int number) {
			this.number = number;
		}
		public void setTime(String time) {
			this.time = time;
		}
		
		@Override
		public int compareTo(Player o) {
			return(time.compareTo(o.time));
		}
	}
	
}