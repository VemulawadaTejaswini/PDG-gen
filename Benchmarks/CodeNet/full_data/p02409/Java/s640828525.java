import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int B_TOTAL = 4;
		final int F_TOTAL = 3;
		final int R_TOTAL = 10;
		Room[][][] univ_rooms = new Room[B_TOTAL][F_TOTAL][R_TOTAL];
		
		for (int i = 0; i < B_TOTAL; i++) {	
			for (int j = 0; j < F_TOTAL; j++) {
				for (int k = 0; k < R_TOTAL; k++) {
					univ_rooms[i][j][k] = new Room(0);
				}
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[4];
		int b, f, r, v;
		for (int i = 0; i < n; i++) {
			str = br.readLine().split("\\s+");
			b = Integer.parseInt(str[0]);
			f = Integer.parseInt(str[1]);
			r = Integer.parseInt(str[2]);
			v = Integer.parseInt(str[3]);
			univ_rooms[b - 1][f - 1][r - 1].setResidents(v);
		}
		
		for (int i = 0; i < univ_rooms.length; i++) {
			for (int j = 0; j < univ_rooms[i].length; j++) {
				for (int k = 0; k < univ_rooms[i][j].length; k++) {
					System.out.print(" " + univ_rooms[i][j][k].getResidents());
				}
				System.out.println();
			}
			if (i < univ_rooms.length - 1) System.out.println("####################");
		}
		
	}
}

class Room {
	
	private int residents;
	
	Room(int residents) {	
		this.residents	= residents;
	}
	
	public int getResidents() {
		return this.residents;
	}
	
	public void setResidents(int n) {
		this.residents += n;
		if (this.residents > 9) this.residents = 9;
		if (this.residents < 0) this.residents = 0;
	}
}