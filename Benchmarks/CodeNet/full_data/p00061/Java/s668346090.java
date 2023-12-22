import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ().doIt();
	}
	class AOJ{
		void doIt(){
			int TEAMS[] = new int[101];
			ArrayList<ArrayList<Integer>> POINTS = new ArrayList<ArrayList<Integer>>();
			for(int i = 0;i < 31;i++)POINTS.add(new ArrayList<Integer>());
			int RANK = 0;
			
			while(true){
				String str[] = sc.next().split(",");
				int team = Integer.parseInt(str[0]);
				int point = Integer.parseInt(str[1]);
				if(team + point == 0)break;
				ArrayList<Integer> array = POINTS.get(point);
				array.add(team);
				POINTS.set(point,array);
			}
			
			for(int i = 30;i >= 0;i--){
				if(POINTS.get(i).size() > 0){
					RANK++;
					ArrayList<Integer> array = POINTS.get(i);
//					System.out.println(RANK+": "+i+" "+array.toString());
					for(int j = 0;j < array.size();j++){
						TEAMS[array.get(j)] = RANK;
					}
				}
			}
			
			while(sc.hasNext()){
				int Q = sc.nextInt();
				System.out.println(TEAMS[Q]);
			}
		}
	}
}