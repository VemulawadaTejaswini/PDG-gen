import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

class Main{
	public static void main(String args[]){
		(new Main()).sets();
	}

	HashMap<String, HashSet<Integer>> setsEnvironment;
	HashSet<Integer> setU;

	void sets(){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		setsEnvironment = new HashMap<String, HashSet<Integer>>();

		setU = new HashSet<Integer>();

		/*
		HashSet<Integer> setA = new HashSet<Integer>();
		setA.add(2);
		setA.add(4);
		setA.add(6);
		setA.add(8);

		HashSet<Integer> setB = new HashSet<Integer>();
		setB.add(2);
		setB.add(6);
		setB.add(9);
		setB.add(10);

		System.out.println(i(setA, setB));
		*/

		// 集合定義のためのハッシュ
		try{
			while((str = br.readLine()) != null){
				// メソッドと引数を分離
				String args[] = str.split(" ");

				// メソッドで場合分け
				if(!args[0].equals("R")){
					int num = Integer.parseInt(args[1]);

					// 行列の入力を受け付ける
					str = br.readLine();
					String elementsStr[] = str.split(" ");

					// 行列を作成
					HashSet<Integer> set = new HashSet<Integer>();
					for(int i = 0; i < elementsStr.length; i++){
						set.add(Integer.parseInt(elementsStr[i]));
					}

					// 環境ハッシュに登録
					setsEnvironment.put(args[0], set);

					// 全体集合に追加
					setU.addAll(set);

					//System.out.println(setsEnvironment.get(args[0]));
				}else{
					// 環境ハッシュに全体集合を追加
					setsEnvironment.put("U", setU);

					// 計算
					HashSet<Integer> resultSet = calc(br.readLine());
					//System.out.println(resultSet);

					// ソートして出力
					TreeSet<Integer> resultTreeSet = new TreeSet<Integer>(resultSet);
					Integer resultArray[] = (Integer[])resultTreeSet.toArray(new Integer[0]);

					System.out.print(resultArray[0]);
					for(int i = 1; i < resultArray.length; i++){
						System.out.print(" " + resultArray[i]);
					}
					System.out.println();

					setU = new HashSet<Integer>();
					setsEnvironment = new HashMap<String, HashSet<Integer>>();
				}
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	HashSet<Integer> calc(String str){
		int lvl = 0;
		int opPointer = 0;
		char op = ' ';
		for(int pointer = 0; pointer < str.length(); pointer++){
			char pointingChar = str.charAt(pointer);
			if(pointingChar == '(') lvl++;
			if(pointingChar == ')') lvl--;
			if(lvl == 0){
				if(pointingChar == 'u' || pointingChar == 'i' || pointingChar == 'd' || pointingChar == 's'){
					opPointer = pointer;
					op = str.charAt(opPointer);
					break;
				}
			}
		}

		HashSet<Integer> resultSet = new HashSet<Integer>();
		if(opPointer != 0){
			// オペランドが見つかった場合
			String leftStr = str.substring(0,opPointer);
			String rightStr = str.substring(opPointer + 1);
			//System.out.println(leftStr);
			//System.out.println(rightStr);

			// それぞれを構文解析にかける
			HashSet<Integer> leftSet = calc(leftStr);
			HashSet<Integer> rightSet = calc(rightStr);

			switch(op){
			case 'u':
				resultSet = u(leftSet, rightSet);
				break;
			case 'i':
				resultSet = i(leftSet, rightSet);
				break;
			case 'd':
				resultSet = d(leftSet, rightSet);
				break;
			case 's':
				resultSet = s(leftSet, rightSet);
				break;
			}
		}else if(str.charAt(0) == '('){
			// 括弧を除去する必要がある場合
			String nextStr = str.substring(1, str.length() - 1);
			//System.out.println(nextStr);
			resultSet = calc(nextStr);

		}else if(str.charAt(0) == 'c'){
			// 補集合をとらなくちゃいけない場合
			String nextStr = str.substring(1, str.length());
			resultSet = calc(nextStr);
			resultSet = d(setU, resultSet);

		}else{
			// 記号に対応する集合を求める
			resultSet = setsEnvironment.get(str);
		}
		return resultSet;
	}

	// union
	static HashSet<Integer> u(HashSet<Integer> setA, HashSet<Integer> setB){
		HashSet<Integer> resultSet = new HashSet<Integer>();
		resultSet.addAll(setA);
		resultSet.addAll(setB);
		return resultSet;
	}

	// intersection
	static HashSet<Integer> i(HashSet<Integer> setA, HashSet<Integer> setB){
		HashSet<Integer> resultSet = new HashSet<Integer>();
		resultSet.addAll(setA);
		resultSet.removeAll(d(setA, setB));
		return resultSet;
	}

	// difference
	static HashSet<Integer> d(HashSet<Integer> setA, HashSet<Integer> setB){
		HashSet<Integer> resultSet = new HashSet<Integer>();
		resultSet.addAll(setA);
		resultSet.removeAll(setB);
		return resultSet;
	}

	// symmetric difference
	static HashSet<Integer> s(HashSet<Integer> setA, HashSet<Integer> setB){
		HashSet<Integer> resultSet = new HashSet<Integer>();
		resultSet.addAll(d(setA, setB));
		resultSet.addAll(d(setB, setA));
		return resultSet;
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

/*
 * 上級アルゴリズムのクラスでは，n^2 の生徒が n*n に座っている
 */