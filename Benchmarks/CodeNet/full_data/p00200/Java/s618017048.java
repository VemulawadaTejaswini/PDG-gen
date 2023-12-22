import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		while(n != 0){
			Station[] s = new Station[m];
			for(int i = 0; i < m ; i++){
				s[i] = new Station(m);
			}
			for(int i = 0 ; i < n ; i++){
				int[] abct = new int[4];
				for(int j = 0 ; j < 4 ; j++){
					abct[j] = sc.nextInt();
				}
				for(int j = 0 ; j < 2 ; j++){
					s[abct[0]-1].costs[abct[1]-1][j] = abct[j+2];
					s[abct[1]-1].costs[abct[0]-1][j] = abct[j+2];
				}
			}
			int k = sc.nextInt();
			for(int i = 0 ; i < k ; i++){
				int p = sc.nextInt()-1;
				int q = sc.nextInt()-1;
				int r = sc.nextInt();
				System.out.println(search(s,p,q,r));
			}
			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
	static int search(Station[] s, int p, int q, int r){
		for(int i = 0 ; i < s.length ; i++){
			s[i].cost = 0;
		}
		ArrayList<Station> open = new ArrayList<Station>();
		open.add(s[p]);
		while(!open.isEmpty()){
			Station o = (Station)open.get(0);
			if(s[p].cost == 0 || o.cost < s[p].cost){
				for(int i = 0 ; i < s.length; i++){
					if(o.costs[i][r] != 0){
						int tcost = o.cost + o.costs[i][r];
						if(s[i].cost == 0 || s[i].cost > tcost){
							s[i].cost = tcost;
							open.add(s[i]);
						}
					}
				}
			}
			open.remove(0);
		}
		return s[q].cost;
	}
}
class Station{
	int cost;
	int[][] costs;
	Station(int m){
		costs = new int[m][2];
	}
}