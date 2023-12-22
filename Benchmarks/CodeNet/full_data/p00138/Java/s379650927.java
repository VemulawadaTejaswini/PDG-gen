import java.util.*;
public class Main {
	void doIt() {
		Scanner in = new Scanner(System.in);
		Player[][] playerArray = new Player [3][8];
		Player[] semiArray = new Player [18];
		for(int i = 0; i < 3; i++){
			for(int k = 0; k < 8; k++){
				playerArray[i][k] = new Player(in.nextInt(), in.nextDouble());
			}
			Arrays.sort(playerArray[i]);
		}
		int cnt = 0;
		for(int i = 0; i < 3; i++){
			for(int k = 2; k < 8; k++){
				semiArray[cnt] = playerArray[i][k];
				cnt++;
			}
		}
		Arrays.sort(semiArray);
		for(int i = 0; i < 3; i++){
			for(int k = 0; k < 2; k++){
				System.out.printf("%d %.2f\n",playerArray[i][k].num, playerArray[i][k].time);
			}
		}
		for(int i = 0; i < 2; i++){
			System.out.printf("%d %.2f\n",semiArray[i].num, semiArray[i].time);
		}
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
	class Player implements Comparable<Player>{
		int num;
		double time;
		Player(int num, double time){
			this.num = num;
			this.time = time;
		}
		@Override
		public int compareTo(Player o) {
			if(this.time > o.time) return 1;
			else if(this.time < o.time) return -1;
			return 0;
		}
	}
}