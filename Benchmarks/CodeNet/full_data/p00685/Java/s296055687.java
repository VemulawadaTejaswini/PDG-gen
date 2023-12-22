import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main{
	static int answer;
	static ArrayList<Integer[]> inputs;

	public static void main(String args[]){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();

		// 集合定義のためのハッシュ
		try{
			while((str = br.readLine()) != null){
				// メソッドと引数を分離
				inputs = new ArrayList<Integer[]>();
				answer = 0;
				String strs[] = str.split(" ");
				int n = Integer.parseInt(strs[0]);
				if(n >= 5) return;
				for(int i = 0; i < 4; i++){
					Integer input[] = new Integer[2];
					input[0]= Integer.parseInt(strs[2 * i]);
					input[1] = Integer.parseInt(strs[2 * i + 1]);
					inputs.add(input);
				}
				//printArray(inputs);
				boolean table[][] = new boolean[4][4];
				int position[] = {0, 0};
				solve(table, position, "");
				System.out.println(answer);
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	public static void solve(boolean table[][], int position[], String rireki){
		// 埋まった場合
		rireki += "(" + position[0] + ", " + position[1] + ")";
		//System.out.println(rireki);
		if(position[0] == 3 && position[1] == 3){
			//System.out.println("埋まった");
			answer++;
			return;
		}

		// 次の座標を用意
		int next_position[] = new int[2];
		next_position[0] = (position[0] + 1) % 4;
		next_position[1] = (position[0] + 1) / 4 + position[1];

		// 既に埋まっている場合は次へ
		if(table[position[0]][position[1]]){
			//System.out.println("埋まっているので次へ");
			solve(table, next_position, rireki);
			return;
		}

		for(int i = 0; i < 4; i++){
			Integer pattern[] = inputs.get(i);
			//System.out.println("当てはめる " + "(" + pattern[0] + ", " + pattern[1] + ")");

			// 座標を足す オーバーしていたらreturn
			int pair_position[] = new int[2];
			pair_position[0] = position[0] + pattern[0];
			if(pair_position[0] < 0 || pair_position[0] > 3) continue;
			pair_position[1] = position[1] + pattern[1];
			if(pair_position[1] < 0 || pair_position[1] > 3) continue;

			// 既に埋まっている場合も return
			if(table[pair_position[0]][pair_position[1]]) continue;

			// 置ける場合は配置して次へ
			table[position[0]][position[1]] = true;
			table[pair_position[0]][pair_position[1]] = true;

			solve(table, next_position, rireki);

			table[position[0]][position[1]] = false;
			table[pair_position[0]][pair_position[1]] = false;
		}
		return;
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