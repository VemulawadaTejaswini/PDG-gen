import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	//国名
	public static String[] name;
	//軍事力
	public static int[] power;
	//隣接国の数
	public static int[] num;
	//隣接国のインデックス
	public static int[][] list;
	//敵味方マップ
	public static int[] map;

	public static final int UNDEF = 0;
	public static final int FRIEND = 1;
	public static final int ENEMY = 2;

	public static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
	}

	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n != 0){
			name = new String[n];
			power = new int[n];
			num = new int[n];
			list = new int[n][n];
			String[][] str = new String[n][n];
			for(int i = 0; i < n; i++){
				name[i] = sc.next();
				power[i] = sc.nextInt();
				num[i] = sc.nextInt();
				for(int j = 0; j < num[i]; j++){
					str[i][j] = sc.next();
				}
				//System.out.println(str + "a");
			}
			//strをlistにする
			for(int i = 0; i < n; i++){
				for(int j = 0; j < num[i]; j++){
					for(int k = 0; k < n; k++){
						if(str[i][j].equals(name[k])){
							list[i][j] = k;
							break;
						}
					}
				}
				//System.out.println(str + "a");
			}
			
			//mapを作る
			map = new int[n];
			//自分の国は味方
			map[0] = FRIEND;
			//printList(0);
			for(int i = 0; i < num[0]; i++){
				map[list[0][i]] = ENEMY;
			}
			int tmp = 0;
			for(int i = 1; i < n; i++){
				if(map[i] == UNDEF){
					tmp = i;
					break;
				}
			}
			//printMap();
			if(tmp < n){
				System.out.println(getMax(1) + power[0]);
			}
			else{
				System.out.println(power[0]);
			}
			n = sc.nextInt();
		}
	}
	//最大の軍事力を返す
	//startより後の國のみ考えれば良い
	public static int getMax(int start){
		//printMap();
		int ret = 0;
		int i;
		for(i = start; i < n; i++){
			if(map[i] == UNDEF){
				break;
			}
		}
		if(i == n - 1){
			return power[i];
		}
		else if(i >= n){
			return ret;
		}
		//味方
		map[i] = FRIEND;
		int[] temp = new int[num[i]];
		int t = 0;
		//printList(i);
		for(int j = 0; j < num[i]; j++){
			int ene = list[i][j];
			if(map[ene] == UNDEF){
				map[ene] = ENEMY;
				//新たに敵に成ったものを記憶
				temp[t] = ene;
				t++;
			}
		}
		ret = getMax(start + 1);
		//System.out.println("if " + i +  " is friend, ret =  " + ret);
		
		ret += power[i];
		for(int j = 0; j < t; j++){
			map[temp[j]] = UNDEF;
		}
		
		//敵
		map[i] = ENEMY;
		int tmp = getMax(start + 1);
		//System.out.println("if " + i +  " is enemy, ret =  " + tmp);
		if(tmp > ret){
			//System.out.println(i + " is Enemy ");
			ret = tmp;
		}
		else{
			//System.out.println(i + " is Friend ");
		}

		//System.out.println("i = " + i + ", ret = " + ret + ", start = " + start);

		return ret;

	}
	
	public static void printMap(){
		for(int i : map){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void printList(int index){
		for(int i : list[index]){
			System.out.print(i + " ");
		}
		System.out.println();
	}

}