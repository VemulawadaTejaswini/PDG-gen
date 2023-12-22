import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> no = new ArrayList<Integer>();
		ArrayList<Integer> score = new ArrayList<Integer>();

		while(true){
			String s = sc.next();
			if(s.equals("0,0")) break;
			no.add(Integer.parseInt(s.split(",")[0]));
			score.add(Integer.parseInt(s.split(",")[1]));
		}

		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int idx = -1;
			for(int i=0;i<no.size();i++){
				if(no.get(i) == n){
					idx = i;
					break;
				}
			}

			HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
			int rank = 1;
			int x = score.get(idx);
			for(int k=0;k<no.size();k++){
				if(score.get(k) > x && map.get(score.get(k)) == null){
					rank++;
					map.put(score.get(k),true);
				}
			}

			System.out.println(rank);
		}
	}
}