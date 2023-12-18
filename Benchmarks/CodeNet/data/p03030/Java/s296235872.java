import java.util.*;
public class Main {//atcoder ABC128B - 

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		Res[] rs = new Res[n];
		for(int i = 0; i < n; i++){
			String name = seer.next();
			int p = seer.nextInt();
			rs[i] = new Res(name, p, i+1);
		}
		Arrays.sort(rs);
		for(int i = 0; i < n; i++){
			System.out.println(rs[i].index);
		}
	}
	static class Res implements Comparable<Res>{
		String name; int score; int index;
		public Res(String name, int score, int index){
			this.name = name; this.score = score; this.index = index;
		}
		@Override
		public int compareTo(Res arg0) {
			if(name.equals(arg0.name)){
				return arg0.score - score;
			}
			else return name.compareTo(arg0.name);
		}
		
	}
}
