import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

class Main{
	static char tiles[][];
	static int w;
	static int h;
	static String answer;
	public static void main(String args[]){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		String str = new String();

		try{
			while(true){
				str = br.readLine();
				String strs[] = str.split(" ");
				w = Integer.parseInt(strs[0]);
				h = Integer.parseInt(strs[1]);

				if(w == 0) break;
				tiles = new char[h][w];
				answer = "0";

				// タイル入力
				for(int i = 0; i < h; i++){
					str = br.readLine();
					for(int j = 0; j < w; j++){
						tiles[i][j] = str.charAt(j);
					}
				}

				//printMatrix(tiles);
				for(int x = 0; x < w; x++){
					for(int y = 0; y < h; y++){
						// 数字で始まっていること
						if('0' <= tiles[y][x] && tiles[y][x] <= '9'){
							// 左が数字でないこと
							if(y == 0 || '9' < tiles[y-1][x]){
								// 上が数字でないこと
								if(x == 0 || '9' < tiles[y][x-1]){
									solve(x, y, "");
								}
							}
						}
					}
				}
				System.out.println(answer);
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	static void solve(int x, int y, String num_str){
		//System.out.println("solve " + x + " " + y);
		num_str = num_str + tiles[y][x];

		boolean end_flag = true;
		// 右を見る
		if(x+1 < w && '0' <= tiles[y][x+1] && tiles[y][x+1] <= '9'){
			solve(x+1, y, num_str);
			end_flag = false;
		}

		// 下を見る
		if(y+1 < h && '0' <= tiles[y+1][x] && tiles[y+1][x] <= '9'){
			solve(x, y+1, num_str);
			end_flag = false;
		}

		if(end_flag){
			//System.out.println(num_str);
			//int num = Integer.parseInt(num_str);
			BigInteger num = new BigInteger(num_str);
			BigInteger ans = new BigInteger(answer);
			if(num.compareTo(ans) == 1) answer = num_str;
		}
	}


	static void printArray(ArrayList<Integer[]> array){
		System.out.println("PrintArray " + array.size());
		for(int i = 0; i < array.size(); i++){
			Integer set[] = array.get(i);
			System.out.print("(" + set[0] + ", " + set[1] + ")");
		}
		System.out.println();
	}

	static void printMatrix(int matrix[][]){
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}
	}

	static void printMatrix(boolean matrix[][]){
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}
	}

	static void printMatrix(char matrix[][]){
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column]);
			}
			System.out.println();
		}
	}

	static void printArray(int array[]){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
}

class OriginalSet{
	public ArrayList<Integer> set;

	OriginalSet(){
		set = new ArrayList<Integer>();
	}

	public void add(int inputInt){
		if(set.indexOf(inputInt) == -1){
			set.add(inputInt);
		}
	}

	public void addAll(OriginalSet inputSet){
		ArrayList<Integer> inputArray = inputSet.set;
		for(int i = 0; i < inputArray.size(); i++){
			add(inputArray.get(i));
		}
	}

	public void remove(int inputInt){
		set.remove((Integer)inputInt);
	}

	public void removeAll(OriginalSet inputSet){
		ArrayList<Integer> inputArray = inputSet.set;
		for(int i = 0; i < inputArray.size(); i++){
			remove(inputArray.get(i));
		}
	}

	public void print(){
		if(set.size() == 0){
			System.out.println("NULL");
			return;
		}
		// ソート
		Collections.sort(set);
		System.out.print(set.get(0));
		for(int i = 1; i < set.size(); i++){
			System.out.print(" " + set.get(i));
		}
		System.out.println();
	}
}