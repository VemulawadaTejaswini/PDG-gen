import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int timelimit = sc.nextInt();
			int team_num = sc.nextInt();
			int q_num = sc.nextInt();
			int record_num = sc.nextInt();
			if(timelimit==0) break;

			Team[] team = new Team[team_num];
			int[][] solved = new int[q_num + 1][team_num];
			for(int i=0; i<team_num; i++){
				team[i] = new Team();
				solved[0][i] = 100-i-1;
			}

			for(int i=1; i<q_num+1; i++){
				Arrays.fill(solved[i], 10000000);
			}

			for(int i=0; i<record_num; i++){
				int minute = sc.nextInt();
				int t = sc.nextInt();
				int q = sc.nextInt();
				int judge = sc.nextInt();
				if(judge!=0){
					team[t-1].wrong++;
				}else{
					solved[team[t-1].cnt][t-1] = 10000000;
					team[t-1].cnt++;
					team[t-1].duration += (minute + team[t-1].wrong*20)*100;
					solved[team[t-1].cnt][t-1] = -t + team[t-1].duration;
					team[t-1].wrong = 0;
				}
			}
			String str = "";
			for(int i=q_num; i>=0; i--){
				Arrays.sort(solved[i]);
				if(solved[i][0]==10000000) continue;	
				str += str.valueOf(100-solved[i][0]%100);
				for(int j=1; j<team_num; j++){
					if(solved[i][j]==10000000) break;
					if(solved[i][j]/100 == solved[i][j-1]/100){
						str += "=" + str.valueOf(100-solved[i][j]%100);
					}else{
						str += "," + str.valueOf(100-solved[i][j]%100);
					}
				}
				str += ",";
			}
			str = str.substring(0, str.length()-1);
			System.out.println(str);
		}
	}

	public static class Team{
		int duration = 100;
		int cnt = 0;
		int wrong = 0;
	}
}