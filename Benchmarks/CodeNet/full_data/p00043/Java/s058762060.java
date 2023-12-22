import java.util.*;

public class Main{
	int [] hash;
	boolean flg;
	HashSet<String> hs;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			int [] data = new int[10];
			for(int i = 0; i < s.length(); i++){
				int res = s.charAt(i) - '0';
				data[res]++;
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = 1 ; i < 10; i++){
				hash = data.clone();
				hash[i]++;
				if(hash[i] >= 5){
					continue;
				}
				flg = false;
				hs = new HashSet<String>();
				dfs(0);
				if(flg){
					sb.append(" " + i);
				}
			}
			if(sb.length() == 0) System.out.println(0);
			else System.out.println(sb.substring(1));
		}
	}

	private void dfs(int deep) {
		String str = Arrays.toString(hash);
		if(hs.contains(str)){
			return;
		}
		hs.add(str);
		boolean isfin = true;
		boolean ishead = false;
		for(int i = 1; i < hash.length; i++){
			if(hash[i] == 0 || hash[i] == 2){
				if(hash[i] == 2){
					if(ishead){
						isfin = false;
						break;
					}
					else{
						ishead = true;
					}
				}
			}
			else{
				isfin = false;
				break;
			}
		}
		if(isfin && ishead){
			flg = true;
			return;
		}
		
		for(int i = 1; i < hash.length; i++){
			
			if(hash[i] >= 3){
				hash[i] = hash[i] - 3;
				dfs(deep + 1);
				hash[i] = hash[i] + 3;
			}
			
			if(i + 2 < hash.length){
				if(hash[i] > 0 && hash[i+1] > 0 && hash[i+2] > 0){
					hash[i]--; hash[i+1]--; hash[i+2]--;
					dfs(deep + 1);
					hash[i]++; hash[i+1]++; hash[i+2]++;
				}
			}
		}
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}