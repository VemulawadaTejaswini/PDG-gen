import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		P1043_Selecting_Teams_Advanced_to_Regional p = new P1043_Selecting_Teams_Advanced_to_Regional();
		int n;
		Team t;
		ArrayList<Team> at;


		while(true){
			n = sc.nextInt();
			at = new ArrayList<P1043_Selecting_Teams_Advanced_to_Regional.Team>();

			if(n == 0){
				break;
			}

			for(int i=0;i<n;i++){
				t = p.new Team();
				t.id = sc.nextInt();
				t.school = sc.nextInt();
				t.solve = sc.nextInt();
				t.wa = sc.nextInt();
				at.add(t);
			}

			Collections.sort(at, new Comparator<P1043_Selecting_Teams_Advanced_to_Regional.Team>() {
				public int compare(Team t1, Team t2){
					String t1str = String.format("$1%2s$2%6s$3%4s", t1.solve,100000-t1.wa,1000-t1.id);
					String t2str = String.format("$1%2s$2%6s$3%4s", t2.solve,100000-t2.wa,1000-t2.id);
					return t2str.compareTo(t1str);
				}
			});

			HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
			int count=0;
			while(!at.isEmpty()){
				if(hm.get(at.get(0).school) == null){
					hm.put(at.get(0).school,1);
					System.out.println(at.get(0).id);
					at.remove(0);
					count++;
				}else{
					switch(hm.get(at.get(0).school)){
					case 1:
						if(count < 20){
							hm.put(at.get(0).school,2);
							System.out.println(at.get(0).id);
							at.remove(0);
							count++;
						}else{
							at.remove(0);
						}
						break;
					case 2:
						if(count < 10){
							hm.put(at.get(0).school,3);
							System.out.println(at.get(0).id);
							at.remove(0);
							count++;
						}else{
							at.remove(0);
						}
						break;
					case 3:
						at.remove(0);
					}
				}
				if(count == 26){
					break;
				}
			}
		}
	}


	public class Team{
		public int id;
		public int school;
		public int solve;
		public int wa;
	}
}