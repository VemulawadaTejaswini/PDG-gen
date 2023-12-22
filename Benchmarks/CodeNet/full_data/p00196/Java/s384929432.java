
import java.util.*;
public class Main {

	class Team implements Comparable<Team>{
		int win;
		int lose;
		String name;

		public Team(int win, int lose, String name) {
			this.win = win;
			this.lose = lose;
			this.name = name;
		}

		public int compareTo(Team other) {
			if(this.win < other.win){
				return 1;
			}
			else if(this.win > other.win){
				return -1;
			}
			else{
				if(this.lose < other.lose){
					return -1;
				}
				else if(this.lose > other.lose){
					return 11;
				}
				else{return 0;}
			}
		}

	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			Team [] list = new Team[n];
			for(int i=0; i < n; i++){
				String name = sc.next();
				int winCount = 0, loseCount = 0;
				for(int j=0; j < n-1; j++){
					int result = sc.nextInt();
					switch(result){
					case 0:
						winCount++;
						break;
					case 1:
						loseCount++;
						break;
					case 2:
						break;
					}
				}
				list[i] = new Team(winCount, loseCount, name);
			}
			Arrays.sort(list);
			for(int i=0; i < list.length;i++){
				System.out.println(list[i].name);
			}
			 n = sc.nextInt();
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}