import java.util.*;

public class Main{
	private static HashSet<String> set;
	private static String s;

	private static int check(String cat){
		if(set.contains(cat)) return 0;

		for(int k=0;k<2;k++){
			for(int j=0;j<4;j++){
				//4ツ嘉ア2ツ古つつクツづァツつオ
				for(int i=0;i<4;i++){
					set.add(cat);
					set.add(cat=cat.substring(2)+cat.substring(0,2));
				}

				cat = "" +
					cat.charAt(1) + cat.charAt(3) +
					cat.charAt(0) + cat.charAt(2) +
					cat.charAt(6) + cat.charAt(4) +
					cat.charAt(7) + cat.charAt(5);
			}

			cat = "" +
				cat.charAt(1) + cat.charAt(7) +
				cat.charAt(3) + cat.charAt(5) +
				cat.charAt(2) + cat.charAt(4) +
				cat.charAt(0) + cat.charAt(6);
		}

		return 1;
	}

	private static int solve(int rem,String cat,boolean used[]){
		if(rem == 0){
			return check(cat);
		}

		int res = 0;
		for(int i=0;i<8;i++){
			if(!used[i]){
				used[i] = true;
				res += solve(rem-1,cat+s.charAt(i),used);
				used[i] = false;
			}
		}
		return res;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			s = "";
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			for(int i=0;i<8;i++){
				String tmp = sc.next();
				if(!map.containsKey(tmp)){
					map.put(tmp,i);
					s += i;
				}
				else{
					s += map.get(tmp);
				}
			}

			set = new HashSet<String>();
			boolean[] used = new boolean[8];
			System.out.println(solve(8,"",used));
		}
	}
}