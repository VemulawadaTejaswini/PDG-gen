
import java.util.*;
public class Main {
	//1335 start
	//1530 stop
	//2242 restart
	//0230 restart
	int [][][][] data;
	int [] vx = {-1, 0, 0, 1,-1, 0, 0};
	int [] vy = {-1, 0, 1, 0, 0,-1, 0};
	int [] vz = {-1,-1, 0, 0, 0, 0, 1};
	ArrayList<String> map;
	HashSet<Integer> set;
	//dice is, 2 = south, 3 = east, 1 = top, 6 = bottom, 4 = west, 5 = north;

	class Dice{
		int [] dice;
		public Dice(int[] dice) {
			this.dice = dice;
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
			data = new int[3][3][3][7];
			//input
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					data[i][j][0][1] = sc.nextInt();
				}
			}
			for(int i = 0; i < 3 ; i++){
				for(int j = 0 ; j < 3; j++){
					data[2][j][i][2] = sc.nextInt();
				}
			}
			set = new HashSet<Integer>();
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
		
		if(x == 2 && y == 0 && z == 2){
			//対面が埋まっていないなら埋める。
			for(int i = 1; i <= 6; i++){
				if(data[y][x][z][i] != 0){
					data[y][x][z][7-i] = 7 - data[y][x][z][i];
				}
			}
			int res = 0;
			for(int i = 0 ; i < 3; i++){
				for(int j = 0 ; j < 3; j++){
					res += data[i][2][j][3];
				}
			}
//			disp();
//			System.out.println("======");
			set.add(res);
			return;
		}
		
		boolean isvalid = true;
		
		//対面が埋まっていないなら埋める。
		for(int i = 1; i <= 6; i++){
			if(data[y][x][z][i] != 0){
				if(data[y][x][z][7-i] == 0){
					data[y][x][z][7-i] = 7 - data[y][x][z][i];
				}
				else if(data[y][x][z][7-i] == 7 - data[y][x][z][i]){
					
				}
				else{
					isvalid = false;
				}
			}
		}
		
		//同じ数字がないかチェックする
		isvalid = isvalid && validcheck(data[y][x][z]);
		if(! isvalid) return ;
		//数字を割り当てる
		int [][][][] work = deepcopy(data);
		for(int ii = 0; ii < map.size(); ii++){
			data = deepcopy(work);
			boolean flg = true;
			for(int j = 1; j <= 6; j++){
				
				if(data[y][x][z][j] == map.get(ii).charAt(j) - '0' || data[y][x][z][j] == 0){
					
				}
				else{
					flg = false;
					break;
				}
			}
			if(! flg){
				continue;
			}
			
			for(int i = 1; i <= 6; i++){
				data[y][x][z][i] = map.get(ii).charAt(i) - '0';
			}
			//周りに伝搬する
			for(int i = 1; i <= 6; i++){
				int xx = vx[i] + x;
				int yy = vy[i] + y;
				int zz = vz[i] + z;
				if(! isOK(xx,yy,zz)) continue;
				if(data[yy][xx][zz][i] == data[y][x][z][i] || data[yy][xx][zz][i] == 0){
					data[yy][xx][zz][i] = data[y][x][z][i];
				}
				else{
					return;
				}
			}
			
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

	private int[][][][] deepcopy(int [][][][] arg) {
		int [][][][] res = new int[3][3][3][7];
		for(int i = 0; i < 3; i++){
			for(int j = 0 ; j < 3; j++){
				for(int k = 0 ; k < 3; k++){
					for(int dind = 1; dind <= 6; dind++){
						res[i][j][k][dind] = arg[i][j][k][dind];
					}
				}
			}
		}
		return res;
	}

	private boolean validcheck(int [] arg) {
		HashSet<Integer> hash = new HashSet<Integer>();
		for(int dind = 1; dind <= 6; dind++){
			if(arg[dind] != 0 && hash.contains(arg[dind])){
				return false;
			}
			hash.add(arg[dind]);
		}
		return true;
	}

	private int anscheck() {
		int sum = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(data[i][2][j][3] == 0) return -1;
				sum += data[i][2][j][3];
			}
		}
		return sum;
	}

	private void disp(){
		for(int z = 0; z < 3; z++){
			System.out.println("z = " + z);
			for(int i = 0 ; i < 3; i++){
				for(int j = 0 ; j < 3; j++){
					System.out.print(Arrays.toString(data[i][j][z]) + " ");
				}
				System.out.println();
			}
		}
		System.out.println();
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


	private void assign(int y, int x, int z, int ind, int num) {
		data[y][x][z][ind] = num;
		data[y][x][z][7-ind] = 7-num;
		//System.out.println("x = " + x + "y = " + y + "z = " + z + "ind = " + ind + "num =" + num);
		for(int i = 1; i < 3;i++){
			int xx = x + vx[ind] * i;
			int yy = y + vy[ind] * i;
			int zz = z + vz[ind] * i;
			if(! isOK(xx,yy,zz)) break;
			if(data[yy][xx][zz][ind] == 0){
				assign(yy,xx,zz,ind,num);
			}
		}
		for(int i = 1; i < 3;i++){
			int xx = x + vx[ind] * -i;
			int yy = y + vy[ind] * -i;
			int zz = z + vz[ind] * -i;
			if(! isOK(xx,yy,zz)) break;
			if(data[yy][xx][zz][ind] == 0){
				assign(yy,xx,zz,ind,num);
			}
		}

		int count = 0;
		int indx = 0;
		for(int i = 1; i <= 3; i++){
			if(i == ind || i == (7- ind)) continue;

			if(data[y][x][z][i] == 0){
				count++;
				indx = i;
			}
		}
		if(count == 1){
			//うめる
			int [] nowdice = data[y][x][z];
			for(int i = 0; i < map.size(); i++){
				String now = map.get(i);
				int [] diffind = check2(nowdice, now);
				if(diffind != null){
					assign(y, x, z, diffind[0] + 1, now.charAt(diffind[0]) - '0');
					break;
				}
			}
		}
	}


	private int[] check2(int[] nowdice, String now) {
		int count = 0;
		int [] ind = new int[2];
		for(int i = 0; i < now.length(); i++){
			int nownum = now.charAt(i) - '0';
			if(nownum != nowdice[i+1]){
				if(count == 2){
					return null;
				}
				ind[count] = i;
				count++;
			}
		}
		return ind;
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