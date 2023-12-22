
import java.util.*;
public class Main {
	
	//Reference nanikaka's code
	Dice [][][] data;
	Dice [][][] work;
	int [] vx = {-1, 0, 0, 1,-1, 0, 0};
	int [] vy = {-1, 0, 1, 0, 0,-1, 0};
	int [] vz = {-1,-1, 0, 0, 0, 0, 1};
	ArrayList<String> map;
	HashSet<Integer> set;
	//dice is, 2 = south, 3 = east, 1 = top, 6 = bottom, 4 = west, 5 = north;

	class Dice{
		int [] dice;
		public Dice(int[] dice) {
			this.dice = Arrays.copyOf(dice, 7);
		}
		private void slide() {
			swap(2,4,5,3);
		}
		private void turn(char c) {
			switch(c){
			case 'n':
				swap(1,5,6,2); break;
			case 's':
				swap(1,2,6,5); break;
			case 'w':
				swap(1,4,6,3); break;
			case 'e':
				swap(1,3,6,4); break;
			}
		}
		private void swap(int i, int j, int k, int l) {
			int temp = dice[l];
			dice[l] = dice[k];
			dice[k] = dice[j];
			dice[j] = dice[i];
			dice[i] = temp;
		}
		public String toString(){
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i <= 6; i++){
				sb.append(dice[i]);
			}
			return sb.toString();
		}
	}

	private void doit(){
		Scanner sc = new Scanner (System.in);
		init();
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			data = new Dice[3][3][3];
			//input
			
			for(int i = 0 ; i < 3; i++){
				for(int j = 0 ; j < 3; j ++){
					for(int k = 0 ; k < 3; k++){
						data[i][j][k] = new Dice(new int[7]);
					}
				}
			}
			
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					data[i][j][0].dice[1] = sc.nextInt();
				}
			}
			for(int i = 0; i < 3 ; i++){
				for(int j = 0 ; j < 3; j++){
					data[2][j][i].dice[2] = sc.nextInt();
				}
			}
			set = new HashSet<Integer>();
			work = deepcopy(data);
			dfs(2, 0, 0);
			if(set.size() == 0){
				System.out.println(0);
				continue;
			}
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int value: set){
				al.add(value);
			}
			Collections.sort(al);
			System.out.print(al.get(0));
			for(int i = 1; i < al.size(); i++){
				System.out.print(" " + al.get(i));
			}
			System.out.println();

			//debug
			//disp();
		}
	}

	private void dfs(int y, int x, int z) {
		//System.out.println("y = " + y + " x= " + x + " z= " + z);
		if(x == 3){
			int res = 0;
			for(int i = 0 ; i < 3; i++){
				for(int j = 0 ; j < 3; j++){
					res += data[i][2][j].dice[3];
				}
			}
			set.add(res);
			return;
		}
		
		//数字を割り当てる
		for(int ii = 0; ii < map.size(); ii++){
			int [] w = new int[7];
			for(int i = 1; i <= 6; i++){
				w[i] = map.get(ii).charAt(i) - '0';
			}
			Dice d = new Dice(w);
			boolean isvalid = true;
			for(int i = 1; i <= 4; i++){
				if(i == 3) continue;
				int xxx = x + vx[i];
				int yyy = y + vy[i];
				int zzz = z + vz[i];
				if(! isOK(xxx,yyy,zzz)) continue;
				if(data[yyy][xxx][zzz].dice[i] != 0 && data[yyy][xxx][zzz].dice[i] != d.dice[i]){
					isvalid = false;
					break;
				}
			}
			for(int i = 1; i <= 6; i++){
				if(work[y][x][z].dice[i] != 0 && work[y][x][z].dice[i] != d.dice[i]){
					isvalid = false;
					break;
				}
			}

			if(! isvalid) continue;
			data[y][x][z] = d;
			//再帰
			if( y == 0 && z == 2){
				dfs(2, x + 1, 0);
			}
			else if(y == 0){
				dfs(2, x, z + 1);
			}
			else{
				dfs(y - 1, x, z);
			}
		}
	}

	private Dice[][][] deepcopy(Dice[][][] arg) {
		Dice [][][] res = new Dice[3][3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0 ; j < 3; j++){
				for(int k = 0 ; k < 3; k++){
					for(int dind = 1; dind <= 6; dind++){
						res[i][j][k] = new Dice(arg[i][j][k].dice);
					}
				}
			}
		}
		return res;
	}

	private void init() {
		map = new ArrayList<String>();
		int [] dice = {0,1,2,3,4,5,6};
		Dice d = new Dice(dice);
		String [] dir = {"", "n", "s", "w", "e", "nn"};
		String [] dirrev = {"", "s", "n", "e", "w", "nn"};
		for(int i = 0 ; i< dir.length; i++){
			for(int j = 0 ; j< dir[i].length(); j++){
				d.turn(dir[i].charAt(j));
			}

			for(int j = 0; j < 4; j++){
				d.slide();
				map.add(d.toString());
			}

			for(int j = 0 ; j< dirrev[i].length(); j++){
				d.turn(dirrev[i].charAt(j));
			}
		}
	}

	private boolean isOK(int xx, int yy, int zz) {
		if(0<= xx && xx < 3 && 0<= yy && yy < 3 && 0<= zz && zz < 3){
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}