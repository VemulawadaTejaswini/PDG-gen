import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<Team> teamList = new ArrayList<>();
            
            int totalTeams = Integer.parseInt(br.readLine());
            for (int i = 0; i < totalTeams; i++) {
				teamList.add(new Team(i));
				
			}
            
            int totalCombination = culcNumOfComb(totalTeams, 2);
            for (int j = 0; j < totalCombination; j++) {
				String[] resultOfGame = br.readLine().split(" ");
				teamList = addPoints(teamList, resultOfGame);
			}
            displayRank(teamList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /*
     * ??????????????????????????°????¨????????????????
     * 
     */
    private static int culcNumOfComb(int teams, int requiredTeamsForGame){
    	int result = 1;
        for(int i = 1; i <= requiredTeamsForGame; i++){
            result = result * (teams - i + 1) / i;
        }
        return result;
    }
    
    /*
     * ??\????????????????????????????????¨????????????????????????????????????????????????
     */
    private static List<Team> addPoints(List<Team> teamList, String[] resultOfGame){
    	int[] gameResult = judgement(Integer.parseInt(resultOfGame[2]), Integer.parseInt(resultOfGame[3]));
    	
    	for(int k=0; k<2; k++){
    		int teamId = Integer.parseInt(resultOfGame[k]) - 1;
    		
			int currentPoints = teamList.get(teamId).getPoint();
			teamList.get(teamId).setPoint(currentPoints + gameResult[k]);
    	}
    	return teamList;
    } 
    
    /*
     * ????????????????????????????????????????¨????????????????
     */
    private static int[] judgement(int scoreOfHome, int scoreOfAway){
    	int[] pointSet = new int[2];
    	
    	if(scoreOfHome > scoreOfAway){
    		pointSet[0] = 3;
    		pointSet[1] = 0;
    		return pointSet;
    	}else if(scoreOfHome < scoreOfAway){
    		pointSet[0] = 0;
    		pointSet[1] = 3;
    		return pointSet;
    	}else{
    		pointSet[0] = 1;
    		pointSet[1] = 1;
    		return pointSet;
    	}
    }
    
    /*
     * ?????????????????????????±??????????
     */
    private static void displayRank(List<Team> teamList){
    	int rank = 1;
    	int comparedPoint = 0;
    	int addRankForSame = 0;
    	List<Team> dammyList = new ArrayList<>(teamList); 
    	
    	Collections.sort(dammyList, new TeamComparator()); //??¬??????????????????Comparator?????????????????¶????????????List????????????
    	comparedPoint = dammyList.get(0).getPoint();
    	teamList.get(dammyList.get(0).getId()).setRank(rank);
    	for(int l=1; l<dammyList.size(); l++){
			Team team = dammyList.get(l);
    		if(team.getPoint() < comparedPoint){
				if(addRankForSame>1){
					rank += addRankForSame;
				}else{
					rank++;
				}
				teamList.get(team.getId()).setRank(rank);
				comparedPoint = team.getPoint();
				addRankForSame = 0;
			}else if(team.getPoint() == comparedPoint){
				if(addRankForSame==0){
					addRankForSame = 1;
				}
				teamList.get(team.getId()).setRank(rank);
				++addRankForSame;
			}
    	}
    	
    	for(Team team : teamList){
    		System.out.println(team.getRank());
    	}
    }
  
    public static class Team{
    	private int id;
    	private int point;
    	private int rank;
    	
    	Team(int id){
    		this.id = id;
    		this.point = 0;
    	}

    	public int getId() {
			return id;
		}
    	
		public int getPoint() {
			return point;
		}

		public void setPoint(int point) {
			this.point = point;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}
    }
    
    public static class TeamComparator implements Comparator<Team>{
    
    	public int compare(Team a, Team b){
    		int pointOfA = a.getPoint();
    		int pointOfB = b.getPoint();
    		
    		if(pointOfA > pointOfB){
    			return -1;
    		}else if(pointOfA==pointOfB){
    			return 0;
    		}else{
    			return 1;
    		}
    	}
    }
}