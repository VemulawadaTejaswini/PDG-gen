import java.util.*;

public class Main{
	int [] order;
	boolean [] used;
	int kind;
	boolean flg;
	int [][] pos;
	char [][] data;
	ArrayList<Character> kindchar;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if((h|w) == 0) break;
			data = new char[h][w];
			for(int i = 0; i < h; i++){
				data[i] = sc.next().toCharArray();
			}
			
			int [] freq = new int[26];
			pos = new int[26][4]; //minx, miny, maxx, maxy
			for(int i = 0; i < 26; i++){
				Arrays.fill(pos[i], -1);
			}
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(data[i][j] == '.') continue;
					int ind = data[i][j] - 'A';
					freq[ind]++;
					if(pos[ind][0] == -1){
						pos[ind][0] = j;
						pos[ind][2] = j;
						pos[ind][1] = i;
						pos[ind][3] = i;
					}
					else{
						pos[ind][0] = Math.min(pos[ind][0], j);
						pos[ind][1] = Math.min(pos[ind][1], i);
						pos[ind][2] = Math.max(pos[ind][2], j);
						pos[ind][3] = Math.max(pos[ind][3], i);
					}
				}
			}
			kind = 0;
			kindchar = new ArrayList<Character>();
			for(int i = 0; i < 26; i++){
				if(freq[i] > 0){
					kindchar.add((char) (i + 'A'));
				}
			}
			kind = kindchar.size();
			order = new int[kind];
			used = new boolean[kind];
			flg = false;
			dfs(0);
			System.out.println(flg ? "SAFE" : "SUSPICIOUS");
		}
	}

	private void dfs(int deep) {
		if(deep == kind){
			if(check()) flg = true;
			return;
		}
		for(int i = 0; i < kind; i++){
			if(used[i]) continue;
			used[i] = true;
			order[deep] = i;
			dfs(deep + 1);
			used[i] = false;
		}
	}

	private boolean check() {
		boolean [] checked = new boolean[26];
		for(int orderi = 0; orderi < order.length; orderi++){
			int nowind = order[orderi];
			char nowchar = kindchar.get(nowind);
			int nowcharind = nowchar - 'A';
			checked[nowcharind] = true;
			
			for(int i = pos[nowcharind][1]; i <= pos[nowcharind][3]; i++){
				for(int j = pos[nowcharind][0]; j <= pos[nowcharind][2]; j++){
					if(data[i][j] == '.') return false;
					if(checked[data[i][j] - 'A'] == false) return false;
				}
			}
		}
		return true;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}