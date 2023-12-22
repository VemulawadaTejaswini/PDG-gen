import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<Pair> list = new ArrayList<Pair>();
		while(true){
			String str = cin.next();
			if(str.equals("0,0")){
				break;
			}
			String[] s = str.split(",");
			list.add(new Pair(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
		}
		Object[] o =  list.toArray();
		Pair[] p = new Pair[o.length];
		for(int i = 0; i < o.length;i++){
			p[i] = (Pair)o[i];
		}
		Arrays.sort(p);
		int count=1;
		int[] scores = new int[31];
		for(int i = 0; i < p.length; ){
			scores[p[i].score]=count;
			int dx=1;

			while(true){
				if(i+dx == p.length)
					break;

				if(p[i].score == p[i+dx].score){


					dx++;
				}
				else{
					break;
				}
			}
			i+=dx;
			count++;
		}

		int[] henkan = new int[p.length+1];
		for(int i = 1; i < p.length+1; i++){
			for(int j = 0; j < p.length; j++){
				if(p[j].team == i){
					henkan[i] = j+1;
					break;
				}
			}
			
			
		}
		while(cin.hasNext()){
			int c = cin.nextInt();

			System.out.println( scores[p[henkan[c]-1].score]);
		}

	}

}
class Pair implements Comparable{
	int team;
	int score;
	Pair(int a, int b){
		team = a;
		score = b;
	}
	public int compareTo(Object o) {
		Pair p = (Pair)o;
		return (-this.score + p.score);

	}

}