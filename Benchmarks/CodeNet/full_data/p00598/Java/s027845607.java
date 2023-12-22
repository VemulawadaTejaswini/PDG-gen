import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;



class Main{
	public static void main(String args[]){
		(new Main()).sets();
	}

	HashMap<String, OriginalSet> setsEnvironment;
	OriginalSet setU;

	void sets(){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		setsEnvironment = new HashMap<String, OriginalSet>();

		setU = new OriginalSet();

		// 集合定義のためのハッシュ
		try{
			while((str = br.readLine()) != null){
				// メソッドと引数を分離
				String args[] = str.split(" ");

				// メソッドで場合分け
				if(!args[0].equals("R")){
					//int num = Integer.parseInt(args[1]);

					// 行列の入力を受け付ける
					str = br.readLine();
					String elementsStr[] = str.split(" ");

					// 行列を作成
					OriginalSet set = new OriginalSet();
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
					// System.out.println("計算");
					OriginalSet resultSet = calc(br.readLine());
					//System.out.println(resultSet);

					// ソートして出力
					resultSet.print();

					setU = new OriginalSet();
					setsEnvironment = new HashMap<String, OriginalSet>();
				}
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	OriginalSet calc(String str){
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

		OriginalSet resultSet = new OriginalSet();
		if(opPointer != 0){
			// オペランドが見つかった場合
			// System.out.print("演算子: ");
			String leftStr = str.substring(0,opPointer);
			String rightStr = str.substring(opPointer + 1);
			// System.out.println(leftStr + ", " + rightStr);

			// それぞれを構文解析にかける
			OriginalSet leftSet = calc(leftStr);
			OriginalSet rightSet = calc(rightStr);

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
			// System.out.print("括弧除去: ");
			String nextStr = str.substring(1, str.length() - 1);
			// System.out.println(nextStr);
			resultSet = calc(nextStr);

		}else if(str.charAt(0) == 'c'){
			// System.out.print("補集合: ");
			// 補集合をとらなくちゃいけない場合
			String nextStr = str.substring(1, str.length());
			//System.out.println(nextStr);
			resultSet = calc(nextStr);
			resultSet = d(setU, resultSet);
			// System.out.println("補集合おわり");

		}else{
			// 記号に対応する集合を求める
			// System.out.print("環境参照: ");
			resultSet = setsEnvironment.get(str);
			// System.out.println("環境参照おわり");
		}
		return resultSet;
	}

	// union
	static OriginalSet u(OriginalSet setA, OriginalSet setB){
		OriginalSet resultSet = new OriginalSet();
		resultSet.addAll(setA);
		resultSet.addAll(setB);
		return resultSet;
	}

	// intersection
	static OriginalSet i(OriginalSet setA, OriginalSet setB){
		OriginalSet resultSet = new OriginalSet();
		resultSet.addAll(setA);
		resultSet.removeAll(d(setA, setB));
		return resultSet;
	}

	// difference
	static OriginalSet d(OriginalSet setA, OriginalSet setB){
		OriginalSet resultSet = new OriginalSet();
		resultSet.addAll(setA);
		resultSet.removeAll(setB);
		return resultSet;
	}

	// symmetric difference
	static OriginalSet s(OriginalSet setA, OriginalSet setB){
		OriginalSet resultSet = new OriginalSet();
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
		System.out.print(set.get(0));
		for(int i = 1; i < set.size(); i++){
			System.out.print(" " + set.get(i));
		}
		System.out.println();
	}
}