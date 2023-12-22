import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static class Team implements Comparable<Team>{
		int id, attr, ac, wa;

		public Team(int id, int attr, int ac, int wa) {
			super();
			this.id = id;
			this.attr = attr;
			this.ac = ac;
			this.wa = wa;
		}

		@Override
		public int compareTo(Team arg0) {
			if(this.ac != arg0.ac){
				return arg0.ac - this.ac;
			}else if(this.wa != arg0.wa){
				return this.wa - arg0.wa;
			}else{
				return this.id - arg0.id;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			Team[] teams = new Team[n];
			for(int i = 0; i < n; i++){
				teams[i] = new Team(sc.nextInt(), sc.nextInt() - 1, sc.nextInt(), sc.nextInt());
			}
			
			Arrays.sort(teams);
			
			int[] attr_count = new int[1000];
			
			int count = 0;
			for(int i = 0; i < n; i++){
				final int safe = count < 10 ? 3 : count < 20 ? 2 : count < 26 ? 1 : 0;

				if(attr_count[teams[i].attr] < safe){
					count++;
					attr_count[teams[i].attr]++;
					System.out.println(teams[i].id);
					//System.out.println(teams[i].ac + " " + teams[i].wa);
				}
			}
		}
	}

}