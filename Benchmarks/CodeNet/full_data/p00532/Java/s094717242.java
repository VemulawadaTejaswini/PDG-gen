
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int human = sc.nextInt();
		int playedgame = sc.nextInt();
		int[] points = new int[human];
		int[] tag = new int[playedgame];
		int missct = 0;
		
		for(int i=0;i<playedgame;i++) tag[i] = sc.nextInt();
		for(int target : tag){
			for(int i=0;i<human;i++){
				int vote = sc.nextInt();
				if(vote-1 == target-1) points[i]++;
				else missct++;
			}
			points[target-1] += missct;
			missct = 0;
		}
		
		for(int pt : points) System.out.println(pt);
	}

}